package wave1

object PrimeNumber {
  def main(args: Array[String]) {
    val number = io.Source.stdin.getLines().next().toInt
    println("NUMBER :: " + number)

    var prime = new Array[Int](number)
    var p = 2
    while (p * p < number) {
      if (prime(p) == 0) {
        var i = p * 2
        while (i < number) {
          prime(i) = 1
          i = i + p
        }
      }
      p = p + 1
    }

    //printing Prime number Till number
    println("Prime numbers till " + number)
    val primeNumbers = prime.zipWithIndex.collect { case (x, index) if (x == 0 && index > 2) => index }
    primeNumbers.foreach(println)
  }
}