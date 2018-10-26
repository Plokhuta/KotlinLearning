package Work_with_classes

class Car(private var weight:Double, private var size:Int) {

  var newCar:Boolean = false
      get() {
      return weight > size
      }
      set(value) {
        if (value == true){
          println("Yeeees")
        }
        field = value
      }
}