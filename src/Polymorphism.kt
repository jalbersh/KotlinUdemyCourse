// Polymorphism - many forms

fun showInfo(cardId:Int) {
    // check if card is valid
    println("CardId: $cardId")
}

fun showInfo(name:String) {
    // check if user is active
    println("name: $name")
}

fun main() {
    showInfo(1)
    showInfo("James")
}