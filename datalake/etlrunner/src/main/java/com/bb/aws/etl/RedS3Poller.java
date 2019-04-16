package com.bb.aws.etl;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.event.S3EventNotification;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RedS3Poller implements RequestHandler<String, String> {

    private final static String RED_S3_LOC = "s3://serverlessdatalakepocforeqrs/red/dvdrental/";
    private final static String queueName = "dvds3queue";

    public String handleRequest(String s, Context context) {
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        final String queueUrl = sqs.getQueueUrl(queueName).getQueueUrl();
        final ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest(queueUrl);
        System.out.println("Receiving messages from queue:" + queueName);

        try {
            List<String> keys = new ArrayList<String>();

            List<Message> messages = sqs.receiveMessage(receiveMessageRequest).getMessages();
            while (messages.size() > 0) {
                List<String> receiptHandles = processMessages(messages, keys);
                deleteMessages(sqs, queueUrl, receiptHandles);
                messages = sqs.receiveMessage(receiveMessageRequest).getMessages();
            }
            for(String key:keys) {
                System.out.println("Acquired the key:" + key);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "done";
    }

    private List<String>  processMessages(List<Message> messages, List<String> keys) {
        System.out.println("There are " + messages.size() + " messages");
        List<String> receiptHandles = new ArrayList<String>();
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
            processS3Event(message.getBody(), keys);
            receiptHandles.add(message.getReceiptHandle());
        }
        return receiptHandles;
    }

    private void processS3Event(String messageBody, List<String> keys) {
        S3EventNotification s3EventNotification = S3EventNotification.parseJson(messageBody);
        System.out.println("Number of records in the S3 event notification:" + s3EventNotification.getRecords().size());
        for(S3EventNotification.S3EventNotificationRecord record:s3EventNotification.getRecords()) {
            String key = record.getS3().getObject().getKey();
            System.out.println("Adding key:" + key);
            keys.add(key);
        }
    }

    private void deleteMessages(AmazonSQS sqs, String queueUrl, List<String> receiptHandles) {
        // Delete the message
        for(String handle:receiptHandles) {
            System.out.println("Deleting the message with handle:" + handle);
            sqs.deleteMessage(new DeleteMessageRequest(queueUrl, handle));
        }
    }


}
