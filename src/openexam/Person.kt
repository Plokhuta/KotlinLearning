package openexam

open class Person (var name: String, val age: Int){


  override fun toString(): String {
    return "Person(name='$name', age=$age)"
  }
}