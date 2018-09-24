package example

object Diamonds extends Greeting with App {
  def greeting = "hello"	// because the template creates a test for this!
  1 to 7 foreach (diamond(_))
}

trait Greeting {

  def diamond(size: Int): Unit = {
  	recursiveDiamond(1, size - (size/2+1))
  }
  import scala.annotation.tailrec

  @tailrec final def recursiveDiamond(count: Int, spaces: Int): Unit = {
  	println( " "*Math.abs( spaces ) + "o"*count )
  	val nspaces = spaces - 1
  	val ncount = count + (if(nspaces >= 0) 2 else -2)
	  if(count > 0) recursiveDiamond(ncount, nspaces)
  }
}
