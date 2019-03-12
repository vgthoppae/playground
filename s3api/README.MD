# What?
This project provides a CloudFormation script to create a REST API hosted at Amazon API Gateway secured by API key to expose S3 folders and objects.

# Contents

* s3api-stack.yaml: Cloudformation template creating a stack containing the below resources
	- REST API at APIGateway
	- IAM Execution role
	- REST API Deployed on a stage
	- API Key
	- Usage Plan
	- Association between Usage Plan and API Key

* s3api-swagger.yaml: API Definitions in a swagger file


# Template Parameters

1. s3apiGatewaySwaggerBucketName - Bucket where API swagger file is stored
2. s3ApiGatewaySwaggerFileName - Swagger File name
3. s3apiGatewayStageName - Where API is to be deployed (defaults to 'dev')
4. s3apiGatewayExecRoleName - IAM Role Name to be assumed by the API (defaults to 's3ApiGateWayExecutionRole')


# How to use it?

1. Create or identify an existing bucket for parameter 1 above
2. Upload s3api-swagger.yaml in this project to the above bucket
3. Create a stack from CloudFormation with s3api-stack.yaml template file providing the bucket name for parameter 1 and "s3api-swagger.yaml" for parameter 2