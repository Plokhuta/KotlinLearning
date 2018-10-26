import java.lang.NullPointerException

fun main(args: Array<String>){

  val st:String?
  st = getSt()
  val size:Int = st!!.length

  print(st)

}

fun getSt():String?{
  return null
}
