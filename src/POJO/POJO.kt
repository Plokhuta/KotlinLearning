package POJO

fun main(args: Array<String>) {
  val person = Person("Alex", 22)

  val person2 = person.copy()

  person2.age = 20

  println(person)
  println(person2)
}