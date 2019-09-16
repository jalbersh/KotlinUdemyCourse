fun main() {
    print("enter the first number: ")
    var num1:Int = readLine()!!.toInt()
    print("enter the second number: ")
    var num2:Int = readLine()!!.toInt()
    num1 = num1 + num2 // given x=10 and y=5, x=15
    num2 = num1 - num2 // y = 15-5 = 10
    num1 = num1 - num2 // x = 10-5 = 5
    println("the first has: $num1 and the second has $num2")
}