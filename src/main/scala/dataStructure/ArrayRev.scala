package dataStructure

object ArrayRev {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt()
  
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        //arr.foreach { x => println(x) }
        
        var temArray = new Array[Int](n)
        for (i <- 0 to arr.length-1){
          temArray(i) = arr(arr.length -(i+1))
        }
        temArray.foreach(println)
    }
}