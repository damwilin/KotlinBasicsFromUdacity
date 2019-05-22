package KotlinEssentials

fun main(args: Array<String>){

}

class Movie(var title:String, var author:String, var length:Int=0){}

fun Movie.weight() = length*1.5