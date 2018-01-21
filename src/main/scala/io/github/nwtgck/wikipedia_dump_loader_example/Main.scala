package io.github.nwtgck.wikipedia_dump_loader_example

import org.apache.spark.sql.{Dataset, SparkSession}
import io.github.nwtgck.wikipedia_dump_loader.{Page, Redirect, Revision, WikipediaDumpLoader}

object Main {
  def main(args: Array[String]): Unit = {
    // Create spark session
    val sparkSession: SparkSession = SparkSession
      .builder()
      .appName("Wikipedia Dump Loader Test [Spark session]")
      .master("local[*]")
      .config("spark.executor.memory", "1g")
      .getOrCreate()

    // Create page Dataset
    val pageDs: Dataset[Page] = WikipediaDumpLoader.readXmlFilePath(
      sparkSession,
      filePath = "./wikidump.xml"
    )

    // Print all pages
    for (page <- pageDs) {
      println(page)
    }
  }
}
