fun main() {
    // ArrayList is array with no limit, it's an dynamic array
    // duplicates size each time is allocates a size
    // avoid using!!!
    println("Pets App")
    // use arrayList instead
    var listOfPets = ArrayList<String>()
//    print("Enter the number of pets: ")
//    val size:Int = readLine()!!.toInt() // just change size variable
//    for (i: Int in 0 until size) {
//        print("Enter pet name $i: ")
//        listOfPets.add(readLine()!!.toString())
//    }
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