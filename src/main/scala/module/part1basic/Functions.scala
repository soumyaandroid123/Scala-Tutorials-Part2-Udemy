package module.part1basic

object Functions extends App {

  // NORMAL FUNCTION IN SCALA
  def aFunction(age: String, n: Int) = {
    // STRING CONCATENATION
    age + " " + n
  }

  println(aFunction("AGE : ", 26))

  /*
  -----------------
  */
  // HERE FUNCTION RETURN TYPE IS STRING ( DEFAULT RETURN TYPE )
  def aFunction1(name: String, value: String) = {
    name + " " + value
  }

  println(aFunction1("NAME : ", "SOUMYA"))

  /*
  -----------------
  */
  // PARAMETER LESS FUNCTION
  def aFunction2(): Int = 26

  println(aFunction2())

  /*
  -----------------
  */
  // ITERATION FUNCTION
  // RECURSIVE FUNCTION - > COMPILER CANNOT BE FIGURE OUT FUNCTION RETURN TYPE
  // WHEN YOU NEED LOOPS USE RECURSION FUNCTION
  def aFunction3(aString: String, n: Int): String = {
    if (n == 1) "HELLO WORLD"
    else aString + ", " + aFunction3(aString, n - 1)
  }

  println(aFunction3("HELLO", 5))

  /*
  -----------------
  */
  // IF YOU ADD THE RETURN TYPE UNIT IN A FUNCTION THEN IT'S RETURNED NULL
  def aFunction4(aString: String): Unit = println("HELLO WORLD")

  println(aFunction4("NAME"))

  /*
  -----------------
  */
  // AUXILIARY / NESTED FUNCTION
  def aFunction5(n: Int): Int = {
    def aFunction6(a: Int, b: Int) = a + b

    aFunction6(n, n - 1)
  }

  println(aFunction5(5))

  /*
   -----------------
  */
  // A GREETING FUNCTION (NAME, AGE) => "HI, MY NAME IS $NAME  AND I HAVE $AGE YEARS OLD".
  def aFunction7(name: String, age: Int): String = {
    "HI, MY NAME IS " + "" + name + " " + "AND I HAVE " + age + " " + "YEARS OLD."
  }

  println(aFunction7("SOUMYA", 26))

  /*
  -----------------
  */
  // FACTORIAL FUNCTION ( 1 * 2 * 3 * 4 * ..... n )
  def aFactorialFunc(a: Int): Int = {
    if (a <= 0) 1
    else a * aFactorialFunc(a - 1)
  }

  println(aFactorialFunc(5))

  /*
    -----------------
  */
  // FIBONACCI SERIES ( F(0) = 0, F(1) = 1, F(2) = 1, F(3) = 2, F(4) = 3, ... F(n) = F(n-1) + F(n-2) )
  // STEP 1 - > THIS FUNCTION TAKES TIME BECAUSE EVERY VALUE CALCULATED MORE MORE TIME SO THAT"S WHY
  // OUTPUT WILL BE SHOWING LATE
  def aFibonacciFunc(n: Long): Long = {
    if (n <= 2) 1
    else aFibonacciFunc(n - 1) + aFibonacciFunc(n - 2)
  }

  println(aFibonacciFunc(7))

  // STEP 2 -> LOOPING
  def aFibonacciFuncOne(n: Int): Int = {
    if (n <= 2) 1
    else {
      var (a, b) = (0, 1)
      var c = a + b
      for (i <- 2 until n) {
        a = b
        b = c
        c = a + b
      }
      c
    }
  }

  println(aFibonacciFuncOne(8))

  // STEP 3 -> USING RECURSION
  def aFibonacciFuncRecursion(n: Int): Int = {
    def helper(n: Int, a: Int, b: Int): Int = if (n <= 0) a + b else helper(n - 1, b, a + b)

    if (n <= 2) 1
    else helper(n - 2, 0, 1)
  }

  println(aFibonacciFuncRecursion(9))


  /*
  -----------------
  */
  // PRIME NUMBER
  def primeNumber(n: Int): Boolean = {
    def isPrimeNumber(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeNumber(t - 1)
    }

    isPrimeNumber(n / 2)
  }

  println(primeNumber(3))

  // CHECK THE NUMBER PRIME OR NOT
  def checkPrimeNum(number: Int): Boolean = {
    val num = number
    var check = false
    for (i <- 2 to num / 2) {
      if (num % i == 0) {
        check = true
      }
    }
    if (check == true) {
      println("This isn't a prime number.")
      check
    } else {
      println("This is a prime number.")
      check
    }
  }

  println(checkPrimeNum(11))

  // FIND SUM OF ALL PRIME NUMBERS BETWEEN 1 TO 100
  def sumOfPrimeNum(num: Int): Int = {
    var isPrime = true
    var sum = 2

    for (i <- 3 to num) {
      for (j <- 2 to i / 2 + 1) {
        if (i % j == 0) {
          isPrime = false
        }
      }
      if (isPrime) {
        sum = sum + i
      }
      isPrime = true
    }
    println("Sum = " + sum)
    sum
  }

  println(sumOfPrimeNum(100))
}
