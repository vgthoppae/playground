const dao = require('./persistence/dao')

exports.handler = async(event, context) => {
  console.log(event);
  console.log(event.company);
  dao.writeStatus(event);
  return "all done"
}