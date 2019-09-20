import com.example.cars.*

fun main(args:Array<String>) {
    val car1 = CarWithConstructor("Toyota",2004, 60000, 60.0, "Giovanna")
    car1.model="Camry"
    car1.print()
    println(car1.getValue())

    val car2 = CarWithConstructor("Toyota",2008, 150000, 50.0, "James")
    car2.model="RAV4"
    car2.print()
    println(car2.getValue())

    // This class is in another package
    var myClass = MyCar()
    myClass.showInfo()
}