fun main(args: Array<String>){

  val myFun = myFun()
  val myFun1 = myFun1(2)
  myFun2()
  val myFun3 = myFun3(2F, 3.2)

  val st:String?

  println("Fun = $myFun \n" +
      "Fun1 = $myFun1 \n" +
      "Fun3 = $myFun3")
}

fun myFun():Int{
  return 1;
}

fun myFun1(a:Long): Int {
  return a.toInt()
}

fun myFun2(){

}

fun myFun3(a:Float, b:Double)= a+b;