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


# How to create the API?

1. Create or identify an existing bucket for parameter 1 above
2. Upload s3api-swagger.yaml in this project to the above bucket
3. Create a stack from CloudFormation with s3api-stack.yaml template file providing the bucket name for parameter 1 and "s3api-swagger.yaml" for parameter 2

# How to use the API?

1. Go to the Cloudformation console and inside the above stack, go to the Outputs tab - note down the value of 's3apiGatewayInvokeURL'. This is the REST API URL
2. Go to the APIGateway Console and click on API Keys link on the side pane - select "basicKeyForS3API" - the detail pane would show various parameters for the selected API Key. Click on 'Show' for the field API Key and copy/save this value. This has to be sent as a header in the REST API requests. Remember not to publicize this key.
3. Go to any REST API client tool such as PostMan -select GET HTTP method - paste the above API URL from #1 - go to the headers tab and define a key 'x-api-key' with api key value from #2 above
4. Hit send to see the result

