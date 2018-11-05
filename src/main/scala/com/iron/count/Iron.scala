/**
  * Created by sigmoid on 1/11/17.
  */

import java.io.{BufferedWriter, File, FileWriter}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.sql.Row
import scala.util.Try


object Iron {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("ironsource-rtb-raw")
    val sc = new SparkContext(conf)
    val sQLContext = new SQLContext(sc)
    sc.setLogLevel("OFF")

    println("Helloooo From Sigmoid...........................................")
  sc.stop()
  }
}

