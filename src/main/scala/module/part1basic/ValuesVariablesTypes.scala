package module.part1basic

object ValuesVariablesTypes extends App {
  // VALS ARE IMMUTABLE
  val x: Int = 4
  // COMPILER CAN INFER TYPES - >
  val x1 = 4
  println(x)
  println(x1)
  // VARS ARE MUTABLE
  var x2 = 2
  x2 = 1
  x2 += 4
  println(x2)
  // ALL VALS & VARS HAVE TYPES
  // PREFER VALS OVER VARS
  // LEARN HOW TO USE BASIC DATA TYPES
  val aBoolean: Boolean = true
  println(aBoolean)
  val aString = "Soumya"
  println(aString)
  val aChar: Char = 's'
  println(aChar)
  val aLong: Long = 12345678
  println(aLong)
  val aShort: Short = 1234
  println(aShort)
  val aFloat: Float = 2.34
  println(aFloat)
  val aDouble: Double = 3.14
  println(aDouble)
}
