package com.example

import org.apache.spark.{SparkConf, SparkContext}

object Spark {
  val conf: SparkConf = new SparkConf()
    .setMaster("local[*]")
    .setAppName("SparkApp")

  val sc = new SparkContext(conf)
}
