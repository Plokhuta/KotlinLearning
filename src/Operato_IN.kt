fun main(args: Array<String>) {

  val characters = 'a'..'z'
  println(serchCharacters('1', characters))

}

fun serchCharacters(char: Char, charRange: CharRange) = char in charRange
