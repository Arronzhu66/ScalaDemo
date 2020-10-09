package main.scala.Test_If

/**
 * @author zbstart    
 * @create 2020-08-22 11:08  
 */
object Test_If {
  def main(args: Array[String]): Unit = {
    var age = 20

    //测试if不同类型返回值后,默认的返回数据类型
    def test_If_01 = if (age > 18) {
      "成人了"
    }else if(age < 8){
      8
    }else {
      "未成年"
    }
    println(test_If_01)

    //测试return返回if内数据
    def test_If_02 : String = if(age < 18) {
      return "未成年人"
      //    } //必须有else结尾
    }else "成年人"


  }

}
