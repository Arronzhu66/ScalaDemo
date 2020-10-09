package main.scala.Test_Unit__Null_Nothing

/**
 * @author zbstart    
 * @create 2020-08-21 20:20  
 */
object Test_Unit__Null_Nothing {

  /*
  测试Unit、Null和Nothing的用法
  **/
  def main(args: Array[String]): Unit = {
    //测试Unit
//    def unitTest() : Unit = {
//
//    }
//    println("测试是否"+unitTest()+"空值") //Unit类型返回的是（）值

    //测试null
    def nullTest() : Null = {
      return null
    }
    println(nullTest()) //返回的是null值

    //测试nothing
    def nothingTest() : Nothing = {
      throw new RuntimeException
    }
    nothingTest() //抛出异常，后面程序不再执行

    println(nullTest())

  }

}
