package abstracts

open abstract class BaseTemplate{

  var count: Int = 0

  fun plus(){
    count++
    println(count)
  }

  abstract fun minus()

}