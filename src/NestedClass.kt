class Outer {
    constructor(name:String) {
        this.name = name
    }
    private var name:String?=null
    fun printName() {
        println("outer name=$name")
    }
    class Nested{
        fun show(){
            println("nested")
        }
    }
}

fun main(args:Array<String>) {
    var outer = Outer("james")
    outer.printName()
    var nested = Outer.Nested()
    nested.show()
}