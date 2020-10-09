package main.scala.Test_Collection

/**
 * @author zbstart    
 * @create 2020-08-30 20:59  
 */
object Test_Map {
  def main(args: Array[String]): Unit = {

    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

    //获取指定 K 的 V
//    val v: Int = map.get("a").get
//    println(v)

    //获取 key 集合
//    val keys: Iterable[String] = map.keys
//    println(keys) //set集合
//
//    for (i <- keys)
//      println(i)

    //如果 K 不存在，返回getOrEles中参数
//    val value: AnyVal = map.get("d").getOrElse(5)
//    val value2: Int = map.get("a").getOrElse(5)
//    println(value2)
//    println(value)

    //
//    map.foreach((k) => println(""))

//    def positions(length: Long, numSlices: Int): Iterator[(Int, Int)] = {
      (0 until 5).iterator.map { i =>
        val start = ((i * 2) / 3).toInt
        val end = (((i + 1) * 2) / 3).toInt
        (start, end)
      }






    }

    //    }


















}
