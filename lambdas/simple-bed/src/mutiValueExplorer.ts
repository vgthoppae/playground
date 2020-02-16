
export class MultiValueExplorer {

  public handler = async (event: any, context: any): Promise<{}> => {
    console.log(event)
    console.log(context)

    // const multiHeaders = {
    //   // 'res-multi': ['Susan', 'ElCamino']
    //   'res-single': 'Carl'
    // }

    const body= {'result': 'ok'};

    return {
      isBase64Encoded: false,
      body: JSON.stringify(body),
      headers: {
        'Set-cookie': 'cookies',
        'Content-Type': 'application/json'
      },
      statusDescription: 'success',
      statusCode: 200
    };
  }
}