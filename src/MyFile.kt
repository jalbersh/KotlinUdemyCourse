import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args:Array<String>) {
    println("1 - read\n2 - write \n")
    when(readLine()!!.toInt()) {
        1->{
            readFromFile()
        }
        2->{
            print("Write to file: ")
            val str:String = readLine().toString();
            writeToFile(str)
        }
    }
}

fun writeToFile(str:String) {
    try {
        val fo= FileWriter("test.txt", true)
        fo.write(str+"\n")
        fo.close()
    } catch (ex:Exception) {
        print(ex.message)
    }
}

fun readFromFile() {
    try {
        val fin = FileReader("test.txt")
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        } while (c != -1)
    } catch (ex:Exception) {
        println(ex.message)
    }
}