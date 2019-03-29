package com.bb.aws.etl;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification;
import com.amazonaws.services.stepfunctions.AWSStepFunctions;
import com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder;
import com.amazonaws.services.stepfunctions.model.GetActivityTaskRequest;
import com.amazonaws.services.stepfunctions.model.GetActivityTaskResult;
import com.amazonaws.services.stepfunctions.model.SendTaskFailureRequest;
import com.amazonaws.services.stepfunctions.model.SendTaskSuccessRequest;
import com.amazonaws.util.json.Jackson;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class EtlRunner implements RequestHandler<S3Event, String> {

    private static final Logger log = LogManager.getLogger(EtlRunner.class);

    private static final String ACTIVITY_ARN = "arn:aws:states:us-east-1:210886440596:activity:PatientFinderActivity";

    private static final Map<String, String> ACTIVITY_ARN_MAP = new HashMap<String, String>();

    static {
        ACTIVITY_ARN_MAP.put("external/dummy.txt", "arn:aws:states:us-east-1:210886440596:activity:ReceiveIDRExtractActivity");
    }

    public String handleRequest(S3Event input, Context context) {
        try {
            // Get Event Record
            S3EventNotification.S3EventNotificationRecord record = input.getRecords().get(0);

            // Source File Name
            String srcFileName = record.getS3().getObject().getKey();

            String eventName = record.getEventName();

            log.info("Event {} on {}", eventName, srcFileName);

            if (!ACTIVITY_ARN_MAP.containsKey(srcFileName)) {
                log.info("No runner configured for key {}", srcFileName);
            } else {
                String activity_arn = ACTIVITY_ARN_MAP.get(srcFileName);
            }

            return "success";
        } catch (Exception e) {
            log.error(e);
        }

        return null;
    }

    public void logMapRecursively(Object entry) {
        if (entry instanceof Map) {
            Map<String, Object> mapEntry = (Map<String, Object>) entry;
            Set<String> keySet = mapEntry.keySet();
            for(String key:keySet) {
                log.info("Key is:" + key);
                Object subEntry = mapEntry.get(key);
                if (subEntry instanceof Map) {
                    log.info("****Traversing inside map...");
                    logMapRecursively(subEntry);
                    log.info("*******...");
                } else {
                    log.info("Value is:" + subEntry);
                }
            }
        }
    }

    public String getGreeting(String who) throws Exception {
        return "{\"Hello\": \"" + who + "\"}";
    }

    private void performActivity(String activity_arn) throws Exception {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setSocketTimeout((int)TimeUnit.SECONDS.toMillis(70));

        AWSStepFunctions client = AWSStepFunctionsClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .withCredentials(new EnvironmentVariableCredentialsProvider())
                .withClientConfiguration(clientConfiguration)
                .build();

        while (true) {
            GetActivityTaskResult getActivityTaskResult =
                    client.getActivityTask(
                            new GetActivityTaskRequest().withActivityArn(ACTIVITY_ARN));

            if (getActivityTaskResult.getTaskToken() != null) {
                try {
                    JsonNode json = Jackson.jsonNodeOf(getActivityTaskResult.getInput());
                    String greetingResult =
                            greeterActivities.getGreeting(json.get("who").textValue());
                    client.sendTaskSuccess(
                            new SendTaskSuccessRequest().withOutput(
                                    greetingResult).withTaskToken(getActivityTaskResult.getTaskToken()));
                    System.out.println("Execution complete......");
                    return;
                } catch (Exception e) {
                    client.sendTaskFailure(new SendTaskFailureRequest().withTaskToken(
                            getActivityTaskResult.getTaskToken()));
                    e.printStackTrace();
                    System.err.println("Execution failed......");
                    return;
                }
            } else {
                Thread.sleep(1000);
            }
        }
    }
}