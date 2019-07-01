package com.ycc.flink.scala.flink

import org.apache.flink.api.common.time.Time
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment


object StremDataApi {
  def main(args: Array[String]): Unit = {

    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val text = env.socketTextStream("localhost", 9999)

   // counts.print()

    env.execute("Window Stream WordCount")
  }


}
