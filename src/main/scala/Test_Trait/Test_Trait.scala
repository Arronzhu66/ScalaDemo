package main.scala.Test_Trait

/**
 * @author zbstart    
 * @create 2020-08-26 18:11  
 */
trait Test_Trait {
  var age = 15 //scala类中的属性值必须赋值。
  val name = "zhangsan"

  def test_Trait01(age: Int)

  def test_Trait02(age: Int,name: String) = {
    println("trait初始方法")
  }

}

class Trait extends Test_Trait {
//  override var age = 15
//  override val name: String = "lisi"  // 属性可以不重写

  override def test_Trait01(age: Int): Unit = {  //必须重写trait无方法体方法
    println("重写trait方法")
  }

  // 可以不重写trait中有方法体中的方法
  override def test_Trait02(age: Int, name: String): Unit = {println("")}

}



















