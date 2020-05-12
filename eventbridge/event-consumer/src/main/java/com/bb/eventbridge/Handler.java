package com.bb.eventbridge;

import java.util.Collections;
import java.util.Map;

import com.bb.schema.s3events.AWSAPICallViaCloudTrail;
import com.bb.schema.s3events.AWSEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<AWSEvent<AWSAPICallViaCloudTrail>, ApiGatewayResponse> {

	private static final Logger LOG = LogManager.getLogger(Handler.class);

	@Override
	public ApiGatewayResponse handleRequest(AWSEvent<AWSAPICallViaCloudTrail> input, Context context) {
		LOG.info("received: {}", input);
		Response responseBody = new Response("Your function executed successfully!", null);

		return ApiGatewayResponse.builder()
				.setStatusCode(200)
				.setObjectBody(responseBody)
				.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
				.build();
	}
}
