open class Operations() {
    open fun sum(n1:Int, n2:Int):Int {return n1+n2}
    fun div(n1:Int, n2:Int):Int {return n1/n2}
    fun sub(n1:Int, n2:Int):Int {return n1-n2}
    fun mul(n1:Int, n2:Int):Int {return n1*n2}
}

class MultiOperations:Operations{
    constructor():super() {

    }
    override fun sum(n1:Int, n2:Int):Int {
        return n1+n2*3
    }
}

fun main(args:Array<String>) {
    var op = Operations()
    var sum:Int = op.sum(10,15)
    println("sum:"+sum)
    var div = op.div(60,15)
    println("div:"+div)
    var op2 = MultiOperations() as Operations // casting as Operations, but overrided by MultiOperations Base
    sum = op2.sum(10,15)
    println("overrided(from parent) sum : "+sum)
}
