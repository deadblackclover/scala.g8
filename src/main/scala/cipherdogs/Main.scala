package cipherdogs

@main def main: Unit =
  println("Hello, world!")
  println(Greeting.msg)

object Greeting:
  def msg: String = "I was compiled by Scala 3. :)"
