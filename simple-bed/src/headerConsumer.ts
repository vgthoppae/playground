import * as moment from 'moment';
// import {HttpHeadersInjector} from 'httpheaders';

export class HeaderConsumer {
  constructor() {}

  public handler = async (event: any, context: any) => {
    let today = moment().format('DD/MMM/YYYY');

    // var headers = {};
    // let injector = new HttpHeadersInjector();
    // injector.injectCorsHeaders(headers);
    // console.log(headers);

    return {
      isBase64Encoded: false,
      body: "status: 'ok",
      headers: {
        'Set-cookie': 'cookies',
        'Content-Type': 'application/json'
      },
      statusDescription: 'success-' + `Today is ${today}`,
      statusCode: 200
    };
  };
}
