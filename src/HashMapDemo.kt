fun main() {
    // array of linkedList - unordered elements
    // HashMap has very fast search
    // each element has a key and value
    // elements for each key can be duplicated
    // keys cannot be duplicated
    var listOfUsers = HashMap<Int,String>()
    listOfUsers[123]="James"
    listOfUsers[12]="Giovanna"
    listOfUsers[5]="Maria"
    listOfUsers[123]="Booger" // replaced element with ID of 123 since no 2 items have same key
    println("Print id 123: ${listOfUsers[123]}")
    for (key:Int in listOfUsers.keys) println("$key: ${listOfUsers[key]}")
}