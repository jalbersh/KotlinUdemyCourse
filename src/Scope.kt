
// same function name and number of arguments in package scope
//fun showInfo(name:String) {
//
//}
var globalName:String?=null

// overloading, polymorphism, and local and global variables
fun showUserInfo() {
    globalName = "booger"
    println("globalName $globalName")
}
fun showUserInfo(name:String) {
    println("name $name")
}
fun showUserInfo(userId:Int) {
    println("userId $userId")
}
fun main() {
    var name="James" // local variable to main
    globalName = "james"
    showInfo(name)
    showUserInfo()
    showUserInfo(12345)
}