package com.car.maintain

// inherits from CarOptions if CarOptions is open
class Truck:CarOptions {
    // default access modifier is public
    var subType:String?=null
    constructor(model:String, year:Int, mileage:Int, costPerThousand:Double, price: Int, owner:String):
            // super refers to parent class
            super(model,year,mileage,costPerThousand,owner,price) {
        this.subType = subType
    }
    constructor(model:String, year:Int, mileage:Int, costPerThousand:Double, price:Int):
            super(model, year, mileage, costPerThousand,price) {
        this.subType = subType
    }
    // overrides print method from Car
    override fun print() {
        println("${this.getOwner()} truck is a ${this.getYear()} ${this.getModel()} ${this.subType} with ${this.getMileage()} miles")
    }
}

// This is an extension method to the Truck class
fun Truck.getCarPrice():Int? {
    return this.getCarPrice()
}

fun main () {
    val truck1 = Truck("Toyota",2004, 60000, 27.0, 27000,"Giovanna")
    truck1.subType = "Half Ton"
    truck1.setModel("Camry")
    truck1.print()
    println(truck1.getValue())
    println("${truck1.getOwner()} spent ${truck1.getCarPrice()}")

    val truck2 = Truck("Toyota",2008, 150000, 30.0, 30000, owner="James")
    truck2.subType = "with Hemi"
    truck2.setModel("RAV4")
    truck2.print()
    println(truck2.getValue())
    println("${truck1.getOwner()} spent ${truck1.getCarPrice()}")

    val listOfCars=arrayListOf<CarOptions>()
    listOfCars.add(truck1)
    listOfCars.add(truck2)
    for (car in listOfCars) car.print()
}