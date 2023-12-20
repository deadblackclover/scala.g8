package cipherdogs

class GreetingSuite extends munit.FunSuite:
  test("say hello"):
    assertEquals(Greeting.msg, "I was compiled by Scala 3. :)")
