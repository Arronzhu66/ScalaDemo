package main.scala.Test_Collection

import scala.collection.mutable.ArrayBuffer

/**
 * @author zbstart    
 * @create 2020-08-27 13:02  
 */

/**
 *测试数组相关方法
 *
 */
object Test_Array {
  def main(args: Array[String]): Unit = {

    //构造不可变array数组
    val array = new Array[Int](5)
    val array2 = Array(5) //实质是调用了array单例对象的apply(x: Int,xs: Int*)方法 括号内参数是array数组的依次赋值
    println(array2.length)

    //替换 Array 数据
    array(2) = 10
    array.update(0,8)
    array.update(1,9)
    array.update(3,5)
//
//    //遍历数组
//    println(array.mkString(",")) //方式一
//
//    for (i <- array){ //方式二
//      println(i)
//    }
//
//    def printx(x: Int) = {
//      println(x)
//    }
////    array.foreach(printx)
////    array.foreach(x => println(x)) //简化
//    array.foreach(println)
//
//    //增加 array 元素
//    array :+ (5)
//    println(array.mkString(",")) //array 原数组未变化
//
//    val ints = array :+ (6) //新创建了一个数组。数组长度为
//    println(ints.mkString(","))
//
//    val array1 = array :+ (5, 85, 5) //


    //构造可变数组
    val arraybuffer01 = new ArrayBuffer[String]()
    val arraybuffer02 = ArrayBuffer(1,2,3)

    //追加 ArrayBuffer 数据
    arraybuffer01.append("zhangsan")
    arraybuffer01.+=("学习")
    arraybuffer02.+= (2)

    //遍历数组
    for (i <- arraybuffer01){
      println(i)
    }

    println(arraybuffer01.mkString(","))

    //指定位置插入数据
    arraybuffer01.insert(0,"尚硅谷")


    //修改 数组 元素
    arraybuffer01(1) = "李四"

    //可变数组和不可变数组转换

    val buffer = array.toBuffer //to.buffer 将不可变转为可变
    buffer.+=(8)
    buffer.append(5,2)
    for (i <- buffer)
      println(i)

    val array1 = arraybuffer01.toArray //toArray 将可变转为不可变
    array1 :+("大数据")
    println(array1.mkString(","))
    val strings: Array[String]= array1 :+ ("大数据")
    println(strings.mkString(","))








  }

}
