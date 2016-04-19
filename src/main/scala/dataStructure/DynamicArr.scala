package dataStructure

import scala.collection.mutable.ArrayBuffer


object DynamicObj extends App {
  val sc = new java.util.Scanner(System.in)
  val N = sc.nextInt
  var Q = sc.nextInt
  var c = N
  var mainList = ArrayBuffer[ArrayBuffer[Int]]()
  while (c > 0) {
    mainList += ArrayBuffer[Int]()
    c = c - 1
  }

  var lastAns = 0

  while (Q > 0) {
    val tag = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()

    tag match {
      case 1 => {
        val seq = (x ^ lastAns) % N
       // println("put :: " + seq)
        mainList(seq) += y
      }
      case 2 => {

        val seq = mainList((x ^ lastAns) % N)

        lastAns = seq((y % seq.size))
        println(lastAns)

      }
      case _ => println("not matching")
    }
    Q = Q - 1
  }
  //println(">>>>>")
  // var count = 0 
  //mainList.foreach(x => { count =count +1 ;println("seq : "+ count); x.foreach(x => print("-"+x))})

}