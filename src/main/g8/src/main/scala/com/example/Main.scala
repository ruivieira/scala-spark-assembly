package com.example

import org.apache.spark.rdd.RDD

object Main {


  def main(args: Array[String]): Unit = {
    println("Hello World!")
    val conf: SparkConf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("SparkApp")
    val sc = new SparkContext(conf)
    val data = sc.parallelize(Array(1.0, 2.0, 3.0, 4.0))

    println(mean(data))
  }

  def mean(data : RDD[Double]) : Double = data.mean()

}
