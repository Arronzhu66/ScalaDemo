package main.scala.Test_Collection

/**
 * @author zbstart    
 * @create 2020-08-31 8:44  
 */
object Test_Function {
  def main(args: Array[String]): Unit = {

    //创建list集合
    val list: List[Any] = List(1, 2, 3, "李四", 3)

    //获取集合第 1 个数据
//    val head: Any = list.head
//    println(head)

    //获取集合尾部，返回另一个集合
//    val tail: List[Any] = list.tail
//    println(tail)
//    tail.foreach(println) //遍历新得到的集合

    //获取集合最后一个数据
//    val last: Any = list.last
//    println(last)

    //（4）集合初始数据集合（不包含最后一个）
    val init: List[Any] = list.init
    println(init)
    init.foreach(println)

    //（5）反转
    val reverse: List[Any] = list.reverse
    println(reverse)
    reverse.foreach(println)

    //（6）取前（后）n个元素
    val take: List[Any] = list.take(3)
    println(take)
    take.foreach(println)

    //（7）去掉前（后）n个元素
    val value: List[Any] = list.drop(3)
    println(value)
    println(list)

    //（8）并集
//    val list2: Any = List(4, 5, 6)
//    list.un
    //（9）交集
    //（10）差集
    //（11）拉链
    //（12）滑窗








  }


}
