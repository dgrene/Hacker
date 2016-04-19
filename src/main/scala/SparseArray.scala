import scala.collection.mutable.ArrayBuffer

object SparseArray extends App {

  val sc = new java.util.Scanner(System.in)

  val N = sc.nextInt()

  val arr1 = new Array[String](N)
  for (i <- 0 to N - 1) {
    arr1(i) = sc.next()
  }
  val Q = sc.nextInt()
  val arr2 = new Array[String](Q)
  for (i <- 0 to Q - 1) {
    arr2(i) = sc.next()
  }

  //print("Input Strings")
  //arr1.foreach(println)
  //println(">>>>>>>>>>>>>>>>>>>>>>>>")

  //print("Query Strings")
  //arr2.foreach(println)
  
  val wordcountArr1 = arr1.foldLeft(Map.empty[String, Int]){
     (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
  }

  var arrF = new ArrayBuffer[Int](N)
  wordcountArr1.map{
  
      case (word,count) => {
        println(word + " :: "+count)
        if(arr2.distinct.contains(word)){
          arrF += count
        }else{
          arrF += count
        }
      }
        
  }
  arrF.foreach (println)

}