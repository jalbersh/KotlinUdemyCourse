// Overloading - same function name, different number of parameters

fun add(number1:Int, number2:Int):Int {
    println("2-args")
    return number1+number2
}

fun add(number1:Int, number2:Int, number3:Int):Int {
    println("3-args")
    return number1+number2+number3
}

fun add(number1:Int, number2:Int, number3:Int, number4:Int):Int {
    println("4-args")
    return number1+number2+number3+number4
}

fun add(vararg numbers:Int):Int {
    println("variable-args")
    var sum:Int = 0
    for (number in numbers) sum += number
    return sum
}

fun main() {
    println(add(3,4))
    println(add(3,4,5))
    println(add(3,4,5,6))
    println(add(3,4,5,6,7))
}