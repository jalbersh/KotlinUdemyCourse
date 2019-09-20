fun main () {
    // continue example
    for (number:Int in 1..10) {
        if (number == 5) continue // skips 5
        println(number)
    }
    // break example
    for (number:Int in 1..10) {
        if (number == 6) break // skips rest after 6
        println(number)
    }

    // break Inner example
    loop@ for (number:Int in 1..10) {
        println("outer: $number")
        for (i:Int in 1..7) {
            println("innerLoop: $i")
            if (i==6) {
                break@loop // breaks outer loop at label
            }
        }
    }

    println("end")

    // return to caller example
    loop@ for (number:Int in 1..10) {
        println("outer: $number")
        for (i:Int in 1..7) {
            println("innerLoop: $i")
            if (i==6) {
                return // returns to com.kotlin.Collections.com.kotlin.Collections.main - doesn't execute last print end
            }
        }
    }

    println("end")

}