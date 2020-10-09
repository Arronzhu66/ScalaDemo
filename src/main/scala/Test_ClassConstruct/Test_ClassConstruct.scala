package main.scala.Test_ClassConstruct

/**
 * @author zbstart    
 * @create 2020-08-25 19:34  
 */
class Test_ClassConstruct(){
  var age: Int = _
  var name: String = _

//  def this() {
//    this
//  }

  def this(age: Int,name: String){
    this
    this.age = age
//    this.name = name //val值不可变
  }

  def test() = {
    println(s"name = $name 的年龄 age = $age")
  }

}

object Test_ClassConstruct02 {
  def main(args: Array[String]): Unit = {
    var test_ClassConstruct = new Test_ClassConstruct()
    test_ClassConstruct.test()

  }

}