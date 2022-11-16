package module.part1basic

object PrimeNumber {

  def isPrime(n: Int): Boolean = {
    if (n < 2) {
      return false
    }
    for (i <- 2 to n / 2) {
      if (n % i == 0) {
        return false
      }
    }
    println(n + " is a prime number")
    true
  }

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 100){
      isPrime(i)
    }
  }
}
