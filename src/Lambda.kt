

fun sum(number1:Int, number2:Int):Int {
    return number1 + number2
}

val lambdaSum = {number1:Int, number2:Int ->
    number1 + number2
}

fun main() {
    val addNumbers = sum(3,4)
    println(addNumbers)
    val useLambda = lambdaSum(5,6)
    println(useLambda)
    println("list of numbers")
    val listOfNumbers = listOf(1,2,3,4,5)
    for (number in listOfNumbers) println(number)
    println("list of numbers")
    listOfNumbers.forEach { number -> println(number) }
    var sum=0
    listOfNumbers.forEach{ number -> sum+=number }
    println("sum of list of numbers is $sum")
}