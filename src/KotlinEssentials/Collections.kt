package KotlinEssentials
fun main(args:Array<String>){
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)

    println(reverseList(testList))

    val symptons = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptons.remove("red spots")
    symptons.contains("not eating")

    listOf(1,4,2).sum()
    listOf("a", "bb", "av").sumBy { it.length }

    val cures = mapOf("white spots" to "ich", "red sores" to "hole disease")
    cures["white spots"]
    cures.getOrDefault("white spots","Sorry, I do not know")
    cures.getOrElse("red spots") {"some function here"}

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

}
fun reverseList(list: List<Int>) : List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size-1 downTo 0){
        result.add(list.get(i))
    }
    return result
}