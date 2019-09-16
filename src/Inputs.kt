/*
   Here is another longer comment over several
   lines of text
*/
fun main() {
    // here is another comment
    // get info
    print("Enter name: ")
    var name: String = readLine()!!.toString()
    print("Enter age: ")
    val age: Int = readLine()!!.toInt()
    print("Enter GPA: ")
    val GPA: Double = readLine()!!.toDouble()
    println("$name is $age years old and has GPA of $GPA")
}
