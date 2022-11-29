package module.part1basic

object StringOperations extends App {
  val str: String = "HI I'M LEARNING SCALA"

  // INT -> STRING
  val count = 2
  println(count.toString)
  // STRING -> INT
  val strCount = "5"
  println(strCount.toInt)

  println(str)
  println(str.charAt(1))
  println(str.split(" ").toList)
  println(str.toLowerCase())
  println(str.startsWith("H"))
  println(str.substring(3, 6))
  println(str.length)
  println(str.repeat(2))
  println(str.replace(" ", "-"))
  println('A' +: strCount :+ 'Z')
  println(str.reverse)
  println(str.take(2))

  // STRING INTERPOLATION
  /*
  USING STRING INTERPOLATION YOU CAN EASILY MODIFY MANIPULATE ANY VALUES AND ALSO IT"S USING TO BE CONCATENATION.
  IN SCALA IT"S 3 TYPES
  1] STRING INTERPOLATOR -> s
  2] FLOAT INTERPOLATOR (SIMILAR LIKE STRING INTERPOLATOR) -> f
  3] RAW (IT'S DOESN'T ACCESS THE SPECIAL CHARACTER \n) -> raw
  */
  val empID = 41
  val empName = "SOUMYA"
  val orgName = "MICROSOFT"
  val salary = 40000
  val bonusPackage = 1.676

  // 1] STRING INTERPOLATOR -> s
  println(s"ID = $empID, NAME = $empName, ORGANISATION = $orgName")
  println(s"ID = $empID, NAME = $empName, ORGANISATION = $orgName, SALARY = ${salary * 2}")

  // 2] FLOAT INTERPOLATOR (SIMILAR LIKE STRING INTERPOLATOR) -> f
  println(f"ID = $empID, NAME = $empName, ORGANISATION = $orgName")
  println(f"ID = $empID, NAME = $empName, ORGANISATION = $orgName, BONUS = $bonusPackage%2.2f")

  // 3] RAW
  println("HELLO\nWORLD") // SPECIAL CHARACTER (\n)
  println(raw"HELLO\nWORLD") // IT AVOIDS THE SPECIAL CHARACTER LIKE \n
}
