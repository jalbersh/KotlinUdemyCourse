fun main(args:Array<String>) {
    try {
        print("enter integer: ")
        var n2:Int= readLine()!!.toInt()
        var div = 100/n2
        println("Div result: $div")
    } catch (ex:Exception) {
        println(ex.message)
    }
    println("app is done")
}