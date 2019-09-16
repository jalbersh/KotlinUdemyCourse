fun main() {
    var name:String = "James"
    val str1:String = "Hello from Kotlin"
    val str2:String = "using variables"
    val age:Int = 56
    val GPA:Double = 3.5
    println("$name, $str1 $str2")
    name = "James Albersheim"
    println("$name is $age years old and has GPA of $GPA")
    var dept:String? = null
    if (dept != null) {
        println("before $name works in the ${dept!!}")
    }
    dept = "Software Engineering"
    println("after $name works in the ${dept!!} department")
}