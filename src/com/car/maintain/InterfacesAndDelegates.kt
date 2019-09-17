package com.car.maintain

// interfaces - any classes that assume same interface have same structure implemented differently
interface CreditCard{
    val cardNumber:String
    fun score(age:Int)
}

class MasterCard(override val cardNumber: String):CreditCard {
    override fun score(age: Int) {
        if (age>50) println("Negative")
        else println("Positive")
    }
}

class Visa(override val cardNumber: String):CreditCard {
    override fun score(age: Int) {
        if (age>60) println("Negative")
        else println("Positive")
    }
}

// example of delegate
class PayPal(client: CreditCard):CreditCard by client {

}
fun main() {
    val visa = Visa("23456789876543")
    visa.score(60)

    // delegate of visa
    val payPal1 = PayPal(visa)
    println("cardNumber PayPal1: ${payPal1.cardNumber}")

    val masterCard = MasterCard("9876543234567890")
    masterCard.score(60)

    // delegate of masterCard
    val payPal2 = PayPal(masterCard)
    println("cardNumber PayPal2: ${payPal2.cardNumber}")
}