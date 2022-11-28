package module.part1basic

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {
  // FACTORIAL NUMBER
  def aFactNumb(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("COMPUTING FACTORIAL NUMBER OF " + n + " - I FIRST NEED FACTORIAL OF " + (n - 1))
      val result = n * aFactNumb(n - 1)
      // THIS ISN'T THE TAIL RECURSIVE BECAUSE HERE FACTORIAL ISN'T THE LAST EXPRESSION
      println("COMPUTED FACTORIAL NUMBER OF " + n)
      result
    }
  }

  println(aFactNumb(10))
  /*
   -----------------
  */
  // IF I GIVE THE BIG NUMBER THEN IT'S SHOWING THE ERROR LIKE STACKOVERFLOW-ERROR
  // THIS ERROR HAPPENS WHEN THE RECURSION DEPTH IS SO BIG LIKE 50000
  /*
     WHY THE BIG NUMBER IS NOT SUPPORTED FOR FIRST FUNCTION
     -> IN THIS IMPLEMENTATION SCALA NEEDS THE RECURSION STACKED FRAME FOR EACH RECURSION CALLED.
     BUT IN SECOND FUNCTION CURRENT RECURSION STACKED FRAME IS REPLACED TO PREVIOUS ONE WITH USING ANY STACKED MEMORY
     SO THAT'S WHY SCALA DOESN'T NEED TO REPEAT THE EACH RECURSION STACKED FRAME
  */
  //println(aFactNumb(50000))

  // SO IN THIS CASE I DO THE RECURSION IN SMART WAY (TAIL RECURSION)
  def aFactorialNumber(n: Int): BigInt = {
    @tailrec
    def aFactorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else aFactorialHelper(x - 1, x * accumulator) // TAIL RECURSIVE -> FACTORIAL IS CALLED AS LAST EXPRESSION
    }

    aFactorialHelper(n, 1)
  }

  println(aFactorialNumber(10))
  /*
    aFactorialNumber(10) = (10, 1)
    = aFactorialHelper(9, 10 * 1)
    = aFactorialHelper(8, 9 * 10 * 1)
    = aFactorialHelper(9, 8 * 9 * 10 * 1)
    .....
    = aFactorialHelper(2, 3 * 4 * .... 10 * 1)
    = aFactorialHelper(1, 1 * 2 * 3 * 4 * .... 10)
    Then First condition is true -> (x <= 1) accumulator
    ( accumulator = 1 * 2 * 3 * 4 * ..... 10 )
  */
  println(aFactorialNumber(5000))

  // WHEN YOU NEED LOOPS THEN USING THE TAIL RECURSIVE FUNCTION

  /*
   -----------------
  */

  // CONCATENATE A STRING N TIMES
  // 1ST METHOD
  def aConcatString(value: String, x: Int): String = {
    if (x <= 0) ""
    else value + " " + aConcatString(value, x - 1)
  }

  println(aConcatString("HELLO", 3))

  // 2ND METHOD
  @tailrec
  def aConcatString2(value: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else aConcatString2(value, n - 1, value + " " + accumulator)
  }

  println(aConcatString2("HELLO", 3, ""))

  /*
   -----------------
  */

  // IS PRIME FUNCTION TRAIL RECURSIVE
  def checkPrime(n: Int): Boolean = {
    @tailrec
    def aHelperPrime(i: Int, isPrime: Boolean): Boolean = {
      if (!isPrime) false
      else if (i <= 1) true
      else aHelperPrime(i - 1, n % i != 0 && isPrime)
    }

    aHelperPrime(n / 2, true)
  }

  println(checkPrime(3))

  /*
   -----------------
  */

  // FIBONACCI METHOD
  def fibonacciFunc(n: Int): Int = {
    @tailrec
    def fibonacciHelper(x: Int, last: Int, nextToLast: Int): Int = {
      if (x >= n) last
      else fibonacciHelper(x + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }
  println(fibonacciFunc(10))
}
