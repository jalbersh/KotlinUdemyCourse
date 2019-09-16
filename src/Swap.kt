fun main() {
    println("enter the first number: ")
    var num1:Int = readLine()!!.toInt()
    println("enter the second number: ")
    var num2:Int = readLine()!!.toInt()
    var temp = num1
    num1 = num2
    num2 = temp
    println("the first has: $num1 and the second has $num2")
}