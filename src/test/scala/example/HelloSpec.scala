package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Diamonds object" should "say hello" in {
    Diamonds.greeting shouldEqual "hello"
  }
}
