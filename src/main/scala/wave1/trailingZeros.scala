package wave1

object trailingZeros {

  def main(args: Array[String]) {
    //println("Hello, world!")
    val N = io.Source.stdin.getLines().next().toInt
    var fact = factorial(N)
    var count = 0
    while (fact % 10 == 0) {
      fact = fact / 10
      count = count + 1
    }
    println(count)
  }

  def factorial(num: BigInt): BigInt = {
    var n = num
    if (n <= 1) {
      1
    } else {
      factorial(n - 1) * n
    }
  }

}