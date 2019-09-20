import java.util.*
import kotlin.collections.ArrayList

class Person(var name:String, var age:Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}
fun main(args:Array<String>) {
    var listOfNames = ArrayList<String>()
    listOfNames.add("James")
    listOfNames.add("Giovanna")
    listOfNames.add("Maria")
    println("before sort")
    for (name in listOfNames) println(name)
    println("after sort")
    Collections.sort(listOfNames) // sorts by comparable method in String, by name in alphabetical order
    for (name in listOfNames) println(name)
    var listOfPersons = ArrayList<Person>()
    listOfPersons.add(Person("James",56))
    listOfPersons.add(Person("Giovanna", 53))
    listOfPersons.add(Person("Maria",79))
    println("before sort")
    for (person in listOfPersons) println("${person.name} is ${person.age} years old")
    println("after sort")
    Collections.sort(listOfPersons) // sorts by comparable method in Person, in this case age in ascending order
    for (person in listOfPersons) println("${person.name} is ${person.age} years old")
}