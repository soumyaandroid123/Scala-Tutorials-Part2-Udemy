package module.part1basic

object Expressions extends App {

  // MATH EXPRESSION ( + - * / & | ^ >> << >>> )
  val x: Int = 1 + 2
  println(x)
  println(1 + 4 * 3)

  // RELATIONAL EXPRESSION ( == != > >= < <= )
  println(x == 3)

  // BOOLEAN / LOGICAL EXPRESSION ( [ ! -> UNARY OPERATOR ] && || )
  println(!(x == 3))

  // ARITHMETIC EXPRESSION ( += -= *= /= ... MUTABLE EXPRESSION .... SIDE EFFECTS )
  var a = 2
  a += 3
  println(a)

  // IF EXPRESSION
  val aCond = true
  val aCondValue = if (aCond) 2 else 3
  println(aCondValue)

  // WHILE LOOP
  var i = 0
  while (i <= 10) {
    println(i)
    i += 1
  }

  // EVEN OR ODD VALUE
  var aValue = 2
  val aEvenValue = aValue % 2 == 0
  println(aEvenValue)
  val aOddValue = !aEvenValue
  println(aOddValue)

  // CODE BLOCK
  val aCodeBloc = {
    val a = 2
    val b = a + 10
    if (b < 10) "Hello" else "Bye"
  }
  println(aCodeBloc)

  val anotherValue = {
    2 < 3
  }
  println(anotherValue)

  // THE VALUE OF THE BLOCK IS THE VALUE OF IT'S LAST EXPRESSION
  val otherVal = {
    if (2 > 3) 5 else 4 // IRRELEVANT EXPRESSION
    "Learning the Scala"
  }
  println(otherVal)
}
