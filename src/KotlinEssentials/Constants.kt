package KotlinEssentials

const val rocks = 3
val num = 5

//can be determined during program excecution
val numOne = complexFunctionCall()

//Const - value determined at compile time
//const val rocksONe = complexFunctionCall()

fun main(args: Array<String>){



}

fun complexFunctionCall():Int{return -1}

class MyClass{

    //const val numTwo = 2

    //companion object is created from static constructor of class; it is created when object is created
    companion object{
        const val numTwo = 2
    }
}