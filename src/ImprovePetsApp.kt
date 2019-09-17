import java.util.*

fun main() {
    var listOfUsers = HashMap<String,LinkedList<String>>()
    while (true) {
        print("Enter your name or quit:")
        val name:String = readLine()!!.toString()
        if (name == "quit") break
        print("Where do you live:")
        val city:String = readLine()!!.toString()
        var listOfUserPets = LinkedList<String>()
        do {
            var petName:String?=""
            print("Enter Pet or type next ")
            petName = readLine()!!.toString()
            if (petName != "next") listOfUserPets.add(petName)
        } while (petName != "next")
        listOfUsers["$name:$city"] = listOfUserPets
    }
    println("*********** user info ***********")
    for (key:String in listOfUsers.keys) {
        println("name and city: $key")
        for (petName: String in listOfUsers[key]!!) {
            println("petName: $petName")
            if(petName!!.contains("cat") || petName!!.contains("julius")) println("Your cat gets a special treat!!!")
        }
    }
}