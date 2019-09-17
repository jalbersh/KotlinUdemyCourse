fun main() {
    var message=" Welcome to Denver"
    var name = "James"
    val both = "$name,$message"
    println(both)
    println("both[0]='${both[0]}'")
    println("message[0]='${message[0]}'")
    println(both.toLowerCase())
    println(message.trim())
    val tokens:List<String> = both.split(" ")
    for (token:String in tokens) {
        if (!(token.contains("to")) && (!token.contains("is")))
            println("token: ${token.replace(",","")}")
    }
}