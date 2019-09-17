import java.util.*

fun main() {
    // linkedList manages size much better than ArrayList
    // not fast query, though O(n)
    // similar structure as ArrayList, except structure is slightly different
    println("Pets App")
    // use arrayList instead
    var listOfPets = LinkedList<String>()
    do {
        print("Enter Pet name or exit to quit: " )
        val petName:String = readLine()!!.toString()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")
    println("has size=${listOfPets.size}")
    println("your pets are using Index: ");
    for (i:Int in 0 until listOfPets.size) {
        println("Pet: $i=${listOfPets[i]}")
    }
    println("your pets are using Object: ");
    for (pet:String in listOfPets) {
        println("Pet: $pet")
    }
    if (listOfPets.contains("cat")) {
        println("Your cat qualifies for special care");
    }
}