package wave1

object HungryLemurs extends App {
  try {
    val I = io.Source.stdin.getLines().next.mkString.replaceAll("\\s+", " ").split(" ").map { x => x.toInt }
    val N = I(0)
    val K = I(1)
    var time: Long = 999999
    if (!(N % K == 0)) {
      for (i <- 1 to (K * 2) - 1) {

        time = Math.min(time, Math.abs(K - i) + Math.min(N % i, i - N % i))
      }
    }
    println(time)
  } catch {
    case e: Exception => println(e.printStackTrace())
  }
}