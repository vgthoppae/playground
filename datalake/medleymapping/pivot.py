import sys
import pydevd
from pyspark.context import SparkContext

def main():
  # Invoke pydevd
  pydevd.settrace('169.254.76.1', port=9001, stdoutToServer=True, stderrToServer=True)




if __name__ == "__main__":
  main()

