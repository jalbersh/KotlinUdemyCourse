fun addNumbers(x:Double=0.0, y:Double=0.0):Double {
    println("addNumbers function")
    val temp:Double = x+y
    return temp
}

// example of variable number of arguments of same type, or use list
fun displayInfo(vararg names:String) {
    for (name in names) println(name)
}
fun main() {
    println("com.kotlin.Collections.com.kotlin.Collections.main function")
    var resultSum = addNumbers(3.0,4.0) // regular call
    println(resultSum)
    resultSum = addNumbers(10.0) // make use of default y
    println(resultSum)
    resultSum = addNumbers(y=120.0) // make use of label y
    println(resultSum)
    displayInfo(names = *arrayOf("james","giovanna","maria"))
    println("end com.kotlin.Collections.com.kotlin.Collections.main fun")
}