package wave1

import scala.io.Source

object MyPrime {
  def main(args: Array[String]) {

    try {
      val N = io.StdIn.readLine()
      val S = io.StdIn.readLine().replaceAll("\\s+", " ")

      //for scala 2.9
      //      val N = Console.readLine
      //      val S = Console.readLine.replaceAll("\\s+", " ")

      val X = S.split(" ").map { x => x.trim.toInt }
      //1println(X)
      var counter = 0

      for (i <- 0 to X.length - 1) {
        //println("i :: " + i)
        for (j <- 0 to X.length - 1 if counter < 2) {
          //println("j :: " + j)
          if (X(i) % X(j) == 0) {
            //println("X(i) :: " + X(i))
            //println("X(j) :: " + X(j))
            counter += 1
          }
        }
        //println("Counter :: " + counter)
        if (counter < 2) println(X(i) + " ")
        counter = 0
      }
    } catch {
      case e: Exception => println(e.printStackTrace)
    }
  }
}