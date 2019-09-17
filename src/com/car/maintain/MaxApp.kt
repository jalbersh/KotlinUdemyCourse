package com.car.maintain

// entension to ArrayList
fun ArrayList<Int>.findMax():Int {
    var max = 0
    for (item in this) {
        if (item > max) max = item
    }
    return max
}
fun main() {
    val listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(1)
    listOfElements.add(20)
    listOfElements.add(4)
    for (item in listOfElements) println(item)
    println("Max is ${listOfElements.findMax()}")
}