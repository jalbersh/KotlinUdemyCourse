// no such thing as static in Kotlin

class Singleton {
    var name:String?=null
    private constructor() {
        println("instance is created")
    }
    // since can't define instance as static,
    // use Singleton pattern and lazy loading of Singleton constructor
    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main(args:Array<String>) {
    var s1 = Singleton.instance
    s1.name = "James"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

    var s3 = Singleton.instance
    println(s3.name)
}