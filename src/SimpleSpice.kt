class SimpleSpice{
    var name: String ="curry"
    var levelOfSpicy: String= "mild"
    val heat : Int
        get() = when(levelOfSpicy){
                "mild" -> 5
                else -> -1
            }


}