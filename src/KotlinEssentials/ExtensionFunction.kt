package KotlinEssentials

fun String.hasSpaces(): Boolean{
    val found = this.find { it==' ' }
    return found != null
}

fun String.hasSpacesSimpler()= find { it == ' '} != null

fun extensionExample(){
    "Does it have spaces?".hasSpaces() //true
}

class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "Red"

fun AquariumPlant.print() = println("AquariumPlant")