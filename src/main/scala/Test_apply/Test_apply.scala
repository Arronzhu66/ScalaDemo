package main.scala.Test_apply

/**
 * @author zbstart    
 * @create 2020-08-25 21:05  
 */
object Test_apply {

//  def apply(): Test_apply = new Test_apply()
  def apply(age0: Int): Test_apply = new Test_apply(age0)

}

class Test_apply(age0: Int){
  var age = 15
//  val name = "zhangsan"

//  private def this(age: Int,name: String){
//    this
//  }

  def test() = {
    println("apply")
  }

//  def test_parater() = println(s"age = $age name = $name")
}

object test{
  def main(args: Array[String]): Unit = {
//    Test_apply().test()
//    val test_apply = new Test_apply()

    var t = Test_apply(18)
    println(t.age)
  }

}

//object Test10 {
//  def main(args: Array[String]): Unit = {
//    // 在scala中经常可以看见var list = List(1,2,3)的这种用法即用类名来调用对象
//    // 实际上它是调用了scala的伴生对象的apply方法返回了一个对象来实现的
//    // apply也支持方法的重载
//
//    // 传统产生对象的方法
//    var a = new Animalb("小明")
//    // 使用apply
//    var b = Animalb();
//    var c = Animalb("小红")
//    println(a.name)
//    println(b.name)
//    println(c.name)
//  }
//}
//
//class Animalb(inName:String){
//  var name = inName
//}
//
//object Animalb{
//  def apply(inName: String): Animalb = new Animalb(inName)
//
//  def apply(): Animalb = {
//    return new Animalb("不知名的动物")
//  }
//}