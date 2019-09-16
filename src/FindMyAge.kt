import java.util.*

fun main(args: Array<String>) {
    print("Enter your birthday(mm/dd/yy): ")
    var birthday:String = readLine()!!.toString()
    val smon = birthday.substring(0,2)
    val sday = birthday.substring(3,5)
    val syear = birthday.substring(6)
    val month:Int = smon.toInt()
    var day:Int = sday.toInt()
    var year:Int = syear.toInt()
    val now:Calendar = Calendar.getInstance()
    val yearInDevice = now.get(Calendar.YEAR)
    if (year+2000 > yearInDevice) year += 1900 else year += 2000
    val monthInDevice = now.get(Calendar.MONTH)
    val dayInDevice = now.get(Calendar.DAY_OF_MONTH)
    var ageYears:Int = 0
    if (monthInDevice > month) ageYears = yearInDevice - year
    else if (monthInDevice < month) ageYears = yearInDevice - 1 - year
    else if (dayInDevice > day) ageYears = yearInDevice - year
    else ageYears = yearInDevice - 1 - year
    var ageMonths:Int = if (monthInDevice > month) monthInDevice - month else 12-(month-monthInDevice)
    var ageDays: Int = 0
    if (dayInDevice > day) {
        ageMonths++
        ageDays = dayInDevice - day
    } else {
        ageDays = 30 - (day - dayInDevice)
    }
    println("You are $ageYears years, $ageMonths months, and $ageDays days old")
    val status = when (ageYears) { 40,41,42,43,44,45,46,47,48,49 -> "still young"
                                   50,51,52,53,54,55,56,57,58,59 -> "ready to retire and saving"
                                   60,61,62,62,64,65,66,67,68,69 -> "retired and living the good life"
                                   else -> "you have a long way to go" }
    when(ageYears) {
        40,41,42,43,44,45,46,47,48,49 -> println("You can only contribute to regular 401(k) contributions")
        50,51,52,53,54,55,56,57,58,59 -> println("you can contribute to catchup 401(k) contributions")
        60,61,62,62,64,65,66,67,68,69 -> println("you can take Social Security benefits and Required Minimum Distributions")
        else -> println("keep on saving")
    }
    println(status)
}