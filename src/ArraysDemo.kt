fun main() {
    // arrays have search (n), access O(1), insert O(n), delete O(n)
    println("Pets App")
//    val pet1:String = readLine()!!.toString()
//    val pet2:String = readLine()!!.toString()
//    val pet3:String = readLine()!!.toString()
//    println("your pets are: ");
//    println("pet1: $pet1")
//    println("pet2: $pet2")
//    println("pet3: $pet3")
    // use array instead
    print("Enter the number of pets: ")
    val size:Int = readLine()!!.toInt() // just change size variable
    var listOfPets:Array<String> = Array(size){""}
    for (i: Int in 0 until size) {
        print("Enter pet name $i: ")
        listOfPets[i] = readLine()!!.toString()
    }
    println("your pets are: ");
    for (i:Int in 0 until size) {
        println("Pet $i=${listOfPets[i]}")
    }
}