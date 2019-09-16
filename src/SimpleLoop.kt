fun main() {
    print("odds: ")
    for (i in 1..99 step 2) print("$i ")
    println()
    print("evens: ")
    for (i in 0..98 step 2) print("$i ")
    println()
    print("down evens: ")
    for (i in 100 downTo 1 step 2) print("$i ")
    println()
    print("down odds: ")
    for (i in 99 downTo 1 step 1) print("$i ")
}