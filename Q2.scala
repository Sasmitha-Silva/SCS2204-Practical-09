def main(args: Array[String]): Unit = {
  if (args.length != 1) {
    println("Please Provide a Single Integer!")
  } else {
    val n: Int = args(0).toInt

    val findType: Int => String = {
      case x if x <= 0     => "The Input is Negative/Zero"
      case x if x % 2 == 0 => "The Input is an Even Number"
      case _               => "The Input is an Odd Number"
    }

    println(findType(n))
  }
}
