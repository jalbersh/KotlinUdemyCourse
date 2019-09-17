// mutable: can update, add more
// immutable: cannot be updated, cannot add more

fun main() {
    // list
    // immutable
    val immutableList:List<String> = listOf("James","Giovanna")
    //immutableList.add("maria") - no such method
    //immutableList[0] = "maria" - no set method
    for (name:String in immutableList) println(name)
    // mutable
    var mutableList:MutableList<String> = mutableListOf("James","Giovanna")
    mutableList.add("Maria") // works
    mutableList[0] = "James Walter" // works
    for (name:String in mutableList) println(name)

    var listOfUsersI:Map<Int,String> = mapOf(1 to "James",2 to "Giovanna")
//    listOfUsersI.add(3,"Maria") - no such method
//    listOfUsersI[0]="Maria" - no set method available
    var listOfUsersM:MutableMap<Int,String> = mutableMapOf(1 to "James",2 to "Giovanna")
    listOfUsersM.set(3,"Maria") //  works
    listOfUsersM.set(0,"James Walter")
    for (name:String in listOfUsersM.values) println(name)
}