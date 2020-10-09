package main.scala.TestFunction

/**
 * @author zbstart    
 * @create 2020-08-24 11:28  
 */
object TestFunction {
  def main(args: Array[String]): Unit = {

//    def f(age:String) : Unit = {
//      println("基本scala函数表达式")
//    }
//    println(f(""))
//
//    //省略函数名小括号和返回值类型
//    def f1 = {
//      "zhubao"
//    }
//
//    //
//    def f2(age: Int): Int = {
//    if (age < 18) {
//      println("未成人")
//      17
//    }else {
//      println("成人了")
//      18
//    }
//    }
//
//    def f3(age: Int): Int = if (age >18){println("成人了");18}else {println("未成人");17}
//
//    //
//    def f5 = (age: Int) => {}
//    def f4(age: Int,name: String): Int = {
//      123
//    }
//    println(f4(1,""))

//    def f7: (Int,String,Char) => Int = (a: Int,b: String,c: Char) => {123}
//    println(f7)
//
//    //函数作为值传递
//   def foo(): Unit = {
//     println("值传递")
//   }
//
//   def foo2: Unit = foo()
//   def foo3 = foo _
//    println(foo2)
//    println(foo3)
//
////   def ff = {""}
//    def ff = () => {""}
//    println(ff)
//    var v1: () => String = ff
//    var v = () => {""}
//    println(v)
//
//    //函数作为参数传递
//    def fff(a:Int,b:Int)= {
//      a+b
//    }
//    def f8(fff:(Int,Int) => Int) = {
//      fff(2,4)
//    }
//    println(f8(fff))

    def f1() = {
      def f2() = {
        println("函数值传递")

      }
      f2 _
    }

//    def f2() = {
//      println("调用函数方法")
//    }
//
//    f2

    def f2 = () => {println("调用函数")}
    f2

    val f = f1()
    println(f1())
    // 因为f1函数的返回值依然为函数，所以可以变量f可以作为函数继续调用
    println(f)
    // 上面的代码可以简化为
//    f1()()











  }

}
