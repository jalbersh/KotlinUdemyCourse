
fun main() {
    var num:Int?
    do {
        print("Enter the number: ")
        num = readLine()!!.toInt()
        if (num%2 == 1) println("$num is odd")
        else println("$num is even")
    } while (num != null || num != 0)
}