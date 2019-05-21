package KotlinEssentials

fun main(args: Array<String>){

    val allBookSet = setOf("Book1", "Romeo & Juliet", "Hamlet")
    val libraryMap = mapOf("William Shakespeare" to allBookSet)

    println(libraryMap.any {it.value.contains("Hamlet")})

    val moreBooks = mutableMapOf("Clean code" to "Robert C. Martin")
    moreBooks.getOrPut("Mobile dla menadzerow") {"Marcin Zareba"}

}

class BookC(var author:String, var title:String, var year:Int)