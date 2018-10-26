package Work_with_classes

fun main(args: Array<String>) {
  val person = Person("Dima", "Plokhuta", 22)
  val car = Car(11.0, 10)
  val newCar = car.newCar
  println(person.name)
  println(person.surName)
  println(person.age)
  println(newCar)
  car.newCar = newCar

}