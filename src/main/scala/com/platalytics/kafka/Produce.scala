package com.platalytics.kafka

object Produce {
  
  def main(args : Array[String]) {
    var producer = new KafkaProducer(topic = "scala", brokerList = "192.168.23.102:9092,192.1686.23.103:9092")
    producer.send("hello scala kafka", null)
  }

}