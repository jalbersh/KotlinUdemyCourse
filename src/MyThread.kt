fun main(args:Array<String>) {
    var t1 = MyThread("t1")
    t1.start()

    var t2 = MyThread("t2")
    t2.start()

    var t3 = MyThread("t3")
    t3.start()

    t3.join() // waits until t3 is done
    println(" com.kotlin.Collections.com.kotlin.Collections.main is run")
}

class MyThread():Thread() {
    var ThreadName:String? = null
    constructor(ThreadName:String):this() {
        this.ThreadName = ThreadName
        println("${ThreadName} is started")
    }
    override fun run() {
        // write thread - will run synchronous in thread
        var count = 0
        while (count < 10) {
            println("$ThreadName count: $count")
            count++
            try {
                Thread.sleep(1000)
            } catch (ex:Exception) {
                println(ex.message)
            }
        }
    }
}