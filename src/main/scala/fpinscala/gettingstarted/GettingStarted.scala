package fpinscala.gettingstarted

object GettingStarted {

  def fibonacci(n: Int) = {
    def loop(times:Int, a:Int, b:Int) : Int = times match {
      case 0 => b
      case k => loop(times - 1, b, a + b)
    }
    loop(n, 0, 1)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n+1)) == true) loop(n+1)
      else false
    }
    loop(0)
  }

  def curry[A,B,C](f: (A,B) => C): A => B => C = (a: A) => (b: B) => f(a, b)
  def uncurry[A,B,C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)
  def compose[A,B,C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}
