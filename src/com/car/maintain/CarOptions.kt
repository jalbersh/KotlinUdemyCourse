package com.car.maintain

// open to be subclassed(inherited from)
open class CarOptions() {
    // above notation is the default or primary constructor
    private var model:String?=null
    private var year: Int?=null
    private var mileage: Int=0
    private var costPerThousand: Double=1.0
    private var owner:String?=null
    private var price:Int?=0

    // these constructors call primary constructor, see notation this() at end of params list
    constructor(model:String, year:Int, mileage:Int, costPerThousand:Double, owner:String, price:Int):this() {
        // this refers to current class
        // this() refers to current class default constructor
        this.model = model
        this.year = year
        this.mileage = mileage
        this.costPerThousand = costPerThousand
        this.owner = owner
        this.price = price
    }
    // these constructors call primary constructor, see notation this() at end of params list
    constructor(model:String, year:Int, mileage:Int, costPerThousand:Double, price:Int):this() {
        this.model = model
        this.year = year
        this.mileage = mileage
        this.costPerThousand = costPerThousand
        this.price = price
    }
    fun setModel(model:String) {
        this.model=model
    }
    fun getOwner():String? {return owner}
    fun getYear():Int? {return year}
    fun getMileage():Int? {return mileage}
    fun getModel():String? {return model}
    // open to be overridden in subclasses
    open fun print() {
        println("$owner car is a $year $model with $mileage miles")
    }
    fun getValue():Double {
        return this.mileage/this.costPerThousand
    }
    fun getCarPrice():Int? {return this.price}
}

fun main () {
    val car1 = CarOptions("Toyota",2004, 60000, 27.0, "Giovanna", 27000)
    car1.setModel("Camry")
    car1.print()
    println(car1.getValue())

    val car2 = CarOptions("Toyota",2008, 150000, 30.0, "James", 30000)
    car2.setModel("RAV4")
    car2.print()
    println(car2.getValue())

    val listOfCars=arrayListOf<CarOptions>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    for (car in listOfCars) car.print()
}