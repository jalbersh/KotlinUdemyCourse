abstract class CreditCard() {
    fun creditID():String {
        return "12345678909876"
    }
    abstract fun newCredit()
}

class UserInfo() : CreditCard() {
    override fun newCredit() {
        println("new card created")
    }

    fun getInfo():String {
        return creditID()
    }
}

fun main(args:Array<String>) {
    var userInfo = UserInfo()
}