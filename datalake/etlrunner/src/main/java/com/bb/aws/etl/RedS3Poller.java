package com.bb.aws.etl;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.*;

import java.util.List;
import java.util.Map;

public class RedS3Poller implements RequestHandler<String, String> {

    private final static String RED_S3_LOC = "s3://serverlessdatalakepocforeqrs/red/dvdrental/";

    public String handleRequest(String s, Context context) {
        String queueUrl = "https://sqs.us-east-1.amazonaws.com/210886440596/reds3queue";
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();

        System.out.println("Receiving messages from MyQueue.\n");
        try {
            final ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(queueUrl);
            receiveMessageRequest.setWaitTimeSeconds(5);
            final List<Message> messages = sqs.receiveMessage(receiveMessageRequest).getMessages();
            System.out.println("There are " + messages.size() + " messages");
            for (final Message message : messages) {
                System.out.println("Message");
                System.out.println("  MessageId:     " + message.getMessageId());
                System.out.println("  ReceiptHandle: " + message.getReceiptHandle());
                System.out.println("  MD5OfBody:     " + message.getMD5OfBody());
                System.out.println("  Body:          " + message.getBody());
                for (final Map.Entry<String, String> entry : message.getAttributes().entrySet()) {
                    System.out.println("Attribute");
                    System.out.println("  Name:  " + entry.getKey());
                    System.out.println("  Value: " + entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        return "done";
    }


}
