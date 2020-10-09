package main.scala.TestCharType

/**
 * @author zbstart    
 * @create 2020-08-21 9:53  
 */
object TestCharType {
  def main(args: Array[String]): Unit = {
    val name = "张三"
    val month = 6

//    println(name+""+month)
//    println(name*3)
//    printf("%s在尚硅谷学习了%d月",name,month)
//    println(s"${name}在尚硅谷学习了${month}月")
    println(
      s"""
        |select *
        |from
        |student
        |where name = $name

      """.stripMargin
    )


  }
}
