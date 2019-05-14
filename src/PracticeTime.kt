import java.util.*

fun main(args: Array<String>){
    //var pass = readLine()
    //whatShouldIDoToday(pass!!)
    //val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    //val filtered = spices.filter {it[0].equals('r')}.sortedBy {it.length }
    //println(filtered)
    var rollDice ={ sides: Int-> if (sides==0) 0 else Random().nextInt(12)}

}

fun whatShouldIDoToday(mood: String= "happy", weather: String="sunny", temperature:Int=24) : String {
    return when{
        mood == "happy" && weather== "Sunny".toLowerCase() -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "stay and die"
    }
}
