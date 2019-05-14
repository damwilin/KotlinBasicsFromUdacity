import java.util.*

fun main(args: Array<String>) {
    //println("Good ${if (args[0].toInt() <= 12) "morning" else "night"} Kotlin")
    //println(getFortuneCookie())


    println(fitMoreFish(10.0, listOf(), 7,true))
}


fun getBirthday(): Int {
    return readLine()?.toIntOrNull() ?: -1
}

fun getFortune(birthday: Int): String {
    val list = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Be humble and all will turn out well."
    )
    print("Enter your birthday")
    return when (birthday) {
        in 28..31 -> "bla bla"
        1 -> "nene"
        else -> "bla ne"
    }

}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    var max = tankSize
    if (hasDecorations)
        max = max.times(0.8)
    return currentFish.sum() + fishSize <= max

}


fun dayOfWeek() {
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("sunday")
        2 -> println("monday")
        7 -> println("saturday")
        else -> println("doesnt matter")
    }
}

fun feedTheFish() {
    val day = "Tuesday"
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}