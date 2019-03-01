import pymysql.cursors

import logging

LOG_FORMAT = "%(asctime)-15s %(name)s %(threadName)s %(message)s"
logging.basicConfig(format=LOG_FORMAT)

logger = logging.getLogger('main')
logger.setLevel(logging.INFO)

def entry_func(event, context):
  logger.info('Received event{}'.format(event))
  logger.info('Connecting to the database...')

  connection = pymysql.connect(host='commondb.cgu55l1gmfys.us-east-1.rds.amazonaws.com',
                               port=3306,
                               user='root',
                               password='password',
                               db='commondb',
                               charset='utf8mb4',
                               cursorclass=pymysql.cursors.DictCursor)

  logger.info('Successfully connected to the database...')

  try:
    logger.info('Executing the select...')
    with connection.cursor() as cursor:
      # Read a single record
      sql = "SELECT version()"
      cursor.execute(sql)
      result = cursor.fetchone()
      logger.info('Fetched the result, returning it...')
      return result
  finally:
    connection.close()

