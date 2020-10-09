package main.scala.Test_For

import scala.util.control.Breaks

/**
 * @author zbstart    
 * @create 2020-08-23 17:29  
 */
object Test_For {
  //测试for
  def main(args: Array[String]): Unit = {
    //测试 to 用法
    for (i <- 1 to 5) {
      println(s"i=$i") //左右都闭合
    }

    println("=========")

    //测试 until 用法
    for (i <- 1 until 5) {
      println(s"s=$i") //左闭右开
    }

    println("=========")

    //if条件判断在for中的使用
//    for(i <- 1 to 5){
//      if (i != 2) println(s"s=$i")
//    }

    for(i <- 1 to 5;if(i != 2)){
      println(s"s=$i")
    }

    println("=========")

    //测试for循环嵌套使用方法
    for (i <- 1 to 5;j <- 2 to 4){
      println(s"s=$i,j=$j")
    }

    println("=========")

    //遍历循环内所有返回值且放入vector集合中
    val res = for (i <- 1 to 5) yield i
      println(res)

    println("=========")

    //中断循环，breakable的使用
    Breaks.breakable {
      for (i <- 1 until 8) {
        println(s"i=$i")
        if (i == 5) Breaks.break()
      }
    }

    //终止本次循环类似continue用法，使用try catch方法
    for (i <- 1 to 10){
      try {
        if (i == 5) throw new RuntimeException
        println(s"s=$i")
      }catch{
            case e =>
      }
    }





  }


}
