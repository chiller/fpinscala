package fpinscala.gettingstarted

import org.scalatest.FlatSpec

class GettingStartedSpec extends FlatSpec {

  "Fibonacci numbers" should "be fine" in {
    assert(GettingStarted.fibonacci(5) == 8)
  }

  "Array sorting" should "be fine" in {
    assert(GettingStarted.isSorted(Array(1,2,3,4), (x: Int, y: Int) => x < y))
    assert(GettingStarted.isSorted(Array('a', 'b', 'c'), (x: Char, y: Char) => x < y))
  }

  "Function currying and uncurrying" should "work" in {
    val myfun = (x: Int, y: Int) => x + y
    val myfunCurried = GettingStarted.curry(myfun)
    val myfunUncurried = GettingStarted.uncurry(myfunCurried)
    assert(3 == myfunUncurried(1, 2))
  }

  "Function composition" should "work" in {
    val myfun = (x: Int) => x * x
    assert(16 == GettingStarted.compose(myfun, myfun)(2))
  }
}
