import * as moment from 'moment';

export class TimeTeller {

  public handler = async (event: any, context: any) => {
    var okStatus= 'ok';
    var body;
    if (event["path"] && event["path"] != "/health") {
      const dateTimeNow = moment().format('LLL');
      body= {"current-time":`${dateTimeNow}`};
    } else {
      body = okStatus;
    }
    console.log(event)
    console.log(context)
    // const multiHeaders= {
    //   'pages': ['customer', 'order'],
    //   'products': 'shirt'
    // }
    const anotherMultiHeader = {
      'products': ['hat', 'shoes']
    }
    var res= {
      isBase64Encoded: false,
      body: JSON.stringify(body),
      multiValueHeaders: {
        // ...multiHeaders,
        ...anotherMultiHeader,
        'Set-cookie': ['cookies'],
        'Content-Type': ['application/json']
      },
      statusDescription: 'success',
      statusCode: 200
    };
    console.log(res)
    return res;
}