package main.scala.Test_Collection

/**
 * @author zbstart    
 * @create 2020-08-31 20:32  
 */
object Test_Function2 {
  def main(args: Array[String]): Unit = {
    val list: List[String] = List("1", "2", "4", "2")

    //sortby
//    val sortby: List[String] = list.sortBy(x => x)
//    sortby.foreach(println)
//    println(sortby)

    //flatten
    val list2: List[List[Int]] = List(List(1, 2), List(3, 4))

//    val value: List[Any] = list2.flatten((x) => {
//      x.productIterator
//    })

//    value.foreach(println)

    //flatmap
    val value: List[Int] = list2.flatMap(list => {
      list
    })

    value.foreach(println)

    val value1: List[List[Int]] = list2.map(x => x)
    value1.foreach(println)










  }

}
