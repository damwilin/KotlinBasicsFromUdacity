package Spices

fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry(name ="Curry type 1",spiciness = "mild")),
        SpiceContainer(Curry("Curry type 2", spiciness = "mild")))

    for (element in spiceCabinet){
        println(element.label)
    }
}

//a sealed class helps keep all the spices together in one file.
sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color{

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 3
                "spicy" -> 5
                "hardSpicy" -> 9
                else -> 0
            }
        }

    init {
        println("Name: ${this.name}    Spiciness: ${this.spiciness}")
    }

    abstract fun prepareSpice()
}

class Curry(name:String, color: SpiceColor= YellowColor, spiciness: String) : Spice(name, spiciness, color),
    Grinder {
    override fun grind() {
        println("grinding $name")
    }

    override fun prepareSpice() {
        grind()
    }

}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowColor : SpiceColor {
    override val color= Color.YELLOW

}
data class SpiceContainer(val spice:Spice, val label: String= spice.name){}

enum class Color(val rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}