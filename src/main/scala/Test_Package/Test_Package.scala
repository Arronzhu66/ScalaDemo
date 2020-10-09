package main.scala.Test_Package {

/**
 * @author zbstart    
 * @create 2020-08-25 18:48  
 */
object Test_Package {
  import main.scala.Test_Package.son_package.son_package
//  def main(args: Array[String]): Unit = {
//  }
  son_package.son_package
  println(son_package.i)

//  def test_Package() = {
//    println("调用上层包方法")
//
//  }
}

  package main.scala.Test_Package.son_package {
    object son_package {
      var i = 5
    def son_package() = {
    println("调用子包方法")
  }
}
  }



}
