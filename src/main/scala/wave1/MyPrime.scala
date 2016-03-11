package wave1

object MyPrime {
  def main(args: Array[String]) {
    val N = io.Source.stdin.getLines().next().toInt
    val S = io.Source.stdin.getLines().next().split(" ").map(_.toInt)

    var counter = 0

    for (i <- 0 to S.length-1) {
      for (j <- 0 to S.length-1 if counter < 2) {
        if (S(i) % S(j) == 0) {
          counter += 1
        }
      }
      if (counter < 2) println(S(i) + " ")
      counter = 0
    }

  }
}