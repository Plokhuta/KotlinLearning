package Enum

enum class Color (val colorHex: String, val opacity:Double? = 1.0){
  BLACK("#123123"),
  WHITE("#45645", 0.3),
  RED("#f23423")

}