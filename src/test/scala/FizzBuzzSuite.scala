import org.scalatest.FunSuite
 
class FizzBuzzSuite extends FunSuite {
   
    test("returns fizz when number is divisible by 3") {
      assert(FizzBuzz.answer(3) === "fizz")
    }
  }
