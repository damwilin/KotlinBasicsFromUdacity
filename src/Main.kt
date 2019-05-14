fun main (args: Array<String>){
    val simpleSpice = SimpleSpice()
    println("Name: ${simpleSpice.name}, heat: ${simpleSpice.heat}")
    val spiceList = listOf<Spice>(
        Spice("a"),
        Spice("a", "spicy"),
        Spice("c", spiciness = "hardSpicy")
    )
    val spiceSpicyList = spiceList.filter { it.heat>=5 }
}