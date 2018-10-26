package cycle

fun main(args: Array<String>) {

//  var index : Int = 0
//  while (index <= 10){
//    println(index)
//    index++
//  }

//  var index2 : Int = 0
//  do {
//    println(index2)
//    index++
//  }while (index <= -1)

  var nums : IntRange = 1..10
  for (values in nums){
    println(values)
  }

  for (values in nums step 2){
    println(values)
  }

  for (values in 10 downTo 1 ){
    println(values)
  }
}
