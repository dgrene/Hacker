package dataStructure

object DHourGlass extends App {
  val sc = new java.util.Scanner(System.in)

  var arr = Array.ofDim[Int](6, 6)

  for (arr_i <- 0 to 6 - 1) {
    for (arr_j <- 0 to 6 - 1) {
      var in = sc.nextInt()
      arr(arr_i)(arr_j) = in
    }
  }

  var count = new Array[Int](4 * 4)

  var x = 0
  for (i <- 0 to 3) {
    for (j <- 0 to 3) {
      try {
        count(x) = arr(i)(j) + arr(i)(j + 1) + arr(i)(j + 2) + arr(i + 1)(j + 1) + arr(i + 2)(j) + arr(i + 2)(j + 1) + arr(i + 2)(j + 2)
        x = x + 1
      } catch {
        case e: Exception => println(e)
      }
    }
  }

  val sArr = count.sorted
  //sArr.foreach { x => println(x) }
  println(sArr(sArr.length - 1))

}