package module.part1basic

// CAL BY VALUE AND CALL BY NAME IS BOTH ARE EVALUATION STRATEGIES FOR THE FUNCTIONS
object CallByValue extends App {
  // VALUE IS EXECUTED ONLY ONE TIME
  // DEFAULT PARAMETERS OF THE FUNCTION
  // CHANGES ARE NOT REFLECTED IN ACTUAL PARAMETER OF THE CALLER
  def student(x: Int): Unit = {
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
