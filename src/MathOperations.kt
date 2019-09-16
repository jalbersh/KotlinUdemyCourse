fun main() {
    print("Enter num1: ")
    val num1:Double = readLine()!!.toDouble()
    print("Enter num2: ")
    val num2:Double = readLine()!!.toDouble()
    val sum = num1 + num2
    println("sum: $sum")
    val sub:Double = num1 - num2
    println("sub = $sub")
    val mul:Double = num1 * num2
    println("mult = $mul")
    val div:Double = num1 / num2
    println("div = $div")
}