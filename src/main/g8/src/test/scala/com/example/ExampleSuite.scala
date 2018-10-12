package com.example

import org.apache.spark.{SharedSparkContext, SparkFunSuite}

class ExampleSuite extends SparkFunSuite with SharedSparkContext {

  override def beforeAll(): Unit = {
    super.beforeAll()
  }

  test("default parameters") {

    val data = sc.parallelize(Array(1.0, 2.0, 3.0, 4.0))

    assert(Main.mean(data) == 2.5)

  }
}
