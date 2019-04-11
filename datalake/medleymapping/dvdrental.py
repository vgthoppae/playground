import sys
from awsglue.transforms import *
from awsglue.utils import getResolvedOptions
from pyspark.context import SparkContext
from awsglue.context import GlueContext
from awsglue.job import Job
import pydevd

def main():
  pydevd.settrace('169.254.76.1', port=9001, stdoutToServer=True, stderrToServer=True)

  glueContext = GlueContext(SparkContext.getOrCreate());

  medicare = glueContext.read.format(
     "csv").option(
     "header", "true").option(
     "inferSchema", "true").load(
     's3://vg-simple-datalake/dvdrental/public/actor/LOAD00000001.csv')
  medicare.printSchema()

if __name__ == "__main__":
  main()
