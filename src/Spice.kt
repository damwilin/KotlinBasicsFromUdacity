class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 3
                "spicy" ->5
                "hardSpicy" -> 9
                else -> 0
            }
        }

    init {
        println("Name: ${this.name}    Spiciness: ${this.spiciness}")
    }

    fun makeSalt() = Spice("salt")
}