class UserAdmin<T>(credit:T) {
    init {
        println(credit)
    }
}

fun <T> display(process:T) {
    println(process)
}

fun main(args:Array<String>) {
    var userAdmin1 = UserAdmin<String>("some kind of credit")
    var userAdmin2 = UserAdmin<Int>(22)
    var userAdmin3 = UserAdmin<Double>(3.14)
    display<Int>(123)
}