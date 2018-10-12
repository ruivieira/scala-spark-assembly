package com.example

import org.apache.spark.rdd.RDD

object Main {


  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }

  def mean(data : RDD[Double]) : Double = data.mean()

}
