package openexam

class Driver (name: String, age:Int, var setCategory: String) : Person(name,age){

  override fun toString(): String {
    return "Person(name='$name', age=$age, Category=$setCategory)"
  }
}