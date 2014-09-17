package com.platalytics.kafka

/**
 * @author ${user.name}
 */
object App {
  var messages: List[String] = _
  
  def main(args : Array[String]) {
    var consumer = new KafkaConsumer(topic = "scala", groupId = "1", zookeeperConnect = "cloud2:2181");
    consumer.read()
    //for (message <- messages) println(message)
  }
  def concat(message: String){
    messages :::= List(message)
  }

}
