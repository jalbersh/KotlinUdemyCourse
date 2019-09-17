package com.car.maintain

data class Person(val name:String, val age:Int, val gender:String)

fun main() {
    val person = Person("James",56, "Male")
    println("${person.name} is a ${person.age} year old ${person.gender}")
}