package main.scala.Test_Symbol

/**
 * @author zbstart    
 * @create 2020-08-23 16:49
 */
object Test_Symbol {
  def main(args: Array[String]): Unit = {
    //测试 == 使用
    var name = "zhangsan"
    var name2 = new String("zhangsan")

    def test_== = if (name == name2) {
      println("两者相等，只比较数据值")
    }else println("需要比较地址值")

    test_==
  }
}
