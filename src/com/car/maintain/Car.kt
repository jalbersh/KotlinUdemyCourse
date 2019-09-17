package com.car.maintain

class Car(var model:String, val year:Int, val mileage:Int, val costPerThousand:Double, val owner:String) {

    init {
        println("Object class car is created")
    }
    fun print() {
        println("$owner car is a $year $model with $mileage miles")
    }
    fun getValue():Double {
        return this.mileage/this.costPerThousand
    }
}

fun main () {
    val car1 = Car("Toyota",2004, 60000, 60.0, "Giovanna")
    car1.model="Camry"
    car1.print()
    println(car1.getValue())

    val car2 = Car("Toyota",2008, 150000, 50.0, "James")
    car2.model="RAV4"
    car2.print()
    println(car2.getValue())

    val listOfCars=arrayListOf<Car>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    for (car in listOfCars) car.print()
}