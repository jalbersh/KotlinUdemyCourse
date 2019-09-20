import com.car.maintain.Car

class CarWithConstructor() {
    var model:String?=null
    var year:Int?=0
    var mileage:Int?=0
    var costPerThousand:Double?=0.0
    var owner:String?=null
    constructor(model:String,year:Int,mileage:Int,costPerThousand:Double,owner:String):this() {
        this.owner=owner
        this.model=model
        this.mileage=mileage
        this.costPerThousand=costPerThousand
        this.year=year
    }
    constructor(model:String,year:Int):this() {
        this.owner=owner
        this.model=model
        this.mileage=mileage
        this.costPerThousand=costPerThousand
        this.year=year
    }
    init {
        println("Object class car is created")
    }
    fun print() {
        println("$owner car is a $year $model with $mileage miles")
    }
    fun getValue():Double {
        return this.mileage!! / this.costPerThousand!!
    }
}

fun main () {
    val car1 = CarWithConstructor("Toyota",2004, 60000, 60.0, "Giovanna")
    car1.model="Camry"
    car1.print()
    println(car1.getValue())

    val car2 = CarWithConstructor("Toyota",2008, 150000, 50.0, "James")
    car2.model="RAV4"
    car2.print()
    println(car2.getValue())

    val listOfCars=arrayListOf<CarWithConstructor>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    for (car in listOfCars) car.print()
}