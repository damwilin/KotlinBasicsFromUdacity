package KotlinEssentials
fun main(args:Array<String>){
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater()
}

fun workWithGenericList() {
    val intList: GenericList<Int>
    val StringList: GenericList<String>
}


class GenericList<T> {
    fun get(pos: Int) {

    }

    fun addItem(item: T) {}
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T){
    fun addWater(){
        check(!waterSupply.needsProcessed){"water supply needs processed"}
        println ("adding water from $waterSupply")
    }
}


