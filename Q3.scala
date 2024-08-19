@main
def main(): Unit = {

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  println(formatNames("Benny")(toUpper))
  println(formatNames("niroshan")(_.patch(1, "I", 1)).patch(0, "N", 1))
  println(formatNames("Saman")(toLower))
  println(formatNames("Kumara")(_.patch(0, "K", 1).patch(5, "A", 1)))
}

def toUpper(string: String): String = {
  string.map { char =>
    if (char >= 'a' && char <= 'z') (char - 32).toChar
    else char
  }
}

def toLower(string: String): String = {
  string.map { char =>
    if (char >= 'A' && char <= 'Z') (char + 32).toChar
    else char
  }
}

def formatNames(name: String)(function: String => String): String = {
  function(name)
}
