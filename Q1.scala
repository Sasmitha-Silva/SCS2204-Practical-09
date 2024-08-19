@main
def main(): Unit = {

  val calculateInterest: Double => Double = deposit =>
    deposit match {
      case x if x <= 20000   => x * 0.02
      case x if x <= 200000  => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case x if x > 2000000  => x * 0.065
    }

  println(s"Interest for Rs. 10000.0 : Rs. ${calculateInterest(10000.0)}")
  println(s"Interest for Rs. 50000.0 : Rs. ${calculateInterest(50000.0)}")
  println(s"Interest for Rs. 500000.0 : Rs. ${calculateInterest(500000.0)}")
  println(s"Interest for Rs. 2500000.0 : Rs. ${calculateInterest(2500000.0)}")
}
