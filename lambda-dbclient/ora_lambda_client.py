import cx_Oracle

import logging

LOG_FORMAT = "%(asctime)-15s %(name)s %(threadName)s %(message)s"
logging.basicConfig(format=LOG_FORMAT)

logger = logging.getLogger('main')
logger.setLevel(logging.INFO)

def entry_func(event, context):
  logger.info('Received event{}'.format(event))
  logger.info('Connecting to the database...')

  con = cx_Oracle.connect('root/password@oradb.cgu55l1gmfys.us-east-1.rds.amazonaws.com/orcl')
  logger.info('Successfully connected to the database...')
  return con.version
  con.close()



