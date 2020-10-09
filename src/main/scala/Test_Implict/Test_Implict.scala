package main.scala.Test_Implict

/**
 * @author zbstart    
 * @create 2020-09-01 8:28  
 */
object Test_Implict {
  def main(args: Array[String]): Unit = {

    implicit val str: String = "hello world!"

    def hello(implicit arg: String="good bey world!"): Unit = {
      println(arg)
    }

    hello()

    def main(args: Array[String]): Unit = {
      hello
    }

    def a(b: String)(implicit a: A) = {
      println(a.a)
    }

//    a("")
  }

}
