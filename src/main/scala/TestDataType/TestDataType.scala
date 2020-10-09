package main.scala.TestDataType

/**
 * @author zbstart    
 * @create 2020-08-21 19:39  
 */
object TestDataType {
  /*
    测试数据转换
    */
  def main(args: Array[String]): Unit = {
    //
//    var a: Byte = 15
//    println(s"$a")

    //
    var b: Long = 15 //低阶数据类型可以自动转换成高阶数据类型
    //    var c : Short = 155555555555 //高阶数据类型不能自动转低阶数据类型
//    var c: Short = 155555555.toShort
//    println(s"$c")

    //String转换Int类型
    var d : Int = "zhubao".toInt
    println(s"$d")


  }
}