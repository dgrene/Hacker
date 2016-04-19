package wave1

import scala.util.control.Breaks

object WobblyNumber extends App {

  var c = 0
  var testCount = 0
  for (ln <- io.Source.stdin.getLines) {
    c = c + 1

    if (c == 1) {
      //println("I am here")
      testCount = ln.trim().toInt
    } else {
      //println("Count :: " + c)
      //println("testCount :: " + testCount)
      val loop = new Breaks()
      loop.breakable {
        //println("WN")
        if (testCount + 1 >= c)
          calculateW(ln)
        else
          loop.break
        //System.exit(0)
      }

    }
  }
  def calculateW(ln: String) = {
    //println("Calculation")
    try {
      val I = ln.replaceAll("\\s+", " ").split(" ").map(_.toInt)

      val N = I(0)
      val K: Double = I(1)

      val a = (math.ceil(K / 9)).toInt
      //println("a ::" + a)
      if (a > 9) {
        println(-1)
      } else {
        var b = (K - 9 * (a - 1)).toInt
        //println("b :: " + b)
        if (b <= a)
          b = (b - 1).toInt

        // println(multiple(N))
        // println("a :: " + a)
        // println("b :: " + b)
        val WN = createWN(N, a, b)
        println(WN)

      }
    } catch {
      case e: Exception => println(e.printStackTrace)
    }
  }
  def createWN(N: Int, a: Int, b: Int) = {
    var c = N
    var f = 0
    var m = a.toString()
    while (c > 1) {
      //println("CC :: " + c)

      if (f == 0) {
        m = (m + "" + b)
        f = 1
      } else {
        m = (m + "" + a)
        f = 0
      }
      c = c - 1
    }
    //println("WN :: " + m)
    m

  }

}