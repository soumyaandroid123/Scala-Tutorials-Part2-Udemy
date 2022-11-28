package module.part1basic


object CallByName extends App {
  // IT'S NOT AN VALUE , IT'S AN EXPRESSION
  // ROCKET SYMBOL IS USED HERE ( => )
  // CHANGES ARE REFLECTED IN ACTUAL PARAMETER OF THE CALLER
  def student(x: => Int): Unit = {
    println("Jackson is deposited Day1 $1 - Balance " + x)
    println("Jackson is deposited Day1 $2 - Balance " + x)
    println("Jackson is deposited Day1 $3 - Balance " + x)
    println("Jackson is deposited Day1 $4 - Balance " + x)
  }

  var amount = 0
  student {
    amount += 1
    amount
  }
}
