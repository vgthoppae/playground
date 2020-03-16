const AWS = require('aws-sdk');
const docClient = new AWS.DynamoDB.DocumentClient();

const writeStatus= async(status) => {
  const promise = docClient.put({
    TableName: 'status-entries',
    Item: {
      pk: 'saico#john',
      sk: '6am',
      location: 's3://tbd'
    }
  }).promise()

  promise
    .then(
      (data) => {
        console.log(data)
        }
    )
    .catch(
      (err) => {
        console.log(err)
      }
    )
}

exports.writeStatus = writeStatus