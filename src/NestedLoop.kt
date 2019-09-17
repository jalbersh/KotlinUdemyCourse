fun main() {
    for (userId:Int in 1..2) {
        print("$userId - Enter your name:")
        val name:String = readLine()!!.toString()
        print("Where do you live:")
        val city:String = readLine()!!.toString()
        var petName:String?=""
        print("Enter the number of pets: ")
        val petsCount:Int = readLine()!!.toInt()
        for (petId:Int in 1..petsCount) {
            print("Enter Pet $petId:")
            petName = petName + readLine()!!.toString() + ","
        }
        println("*********** user info ***********")
        println("name: $name")
        println("city: $city")
        println("perName: $petName")
        if(petName!!.contains("cat")) println("Your cat gets a special treat!!!")
    }
}