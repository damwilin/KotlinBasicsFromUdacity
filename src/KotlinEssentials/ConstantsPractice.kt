package KotlinEssentials

const val MAX_BOOK_QUANTITY = 9
fun main(args: Array<String>){
    val user = User("Jane")
    val bookOne = BookE("Title", "Author")
    println(bookOne.canBorrow(user))

}
class BookE(var title:String, var author:String) {
    fun canBorrow(user:User): Boolean{
        return user.bookQuantity < MAX_BOOK_QUANTITY

    }
}

data class User(val name:String,var bookQuantity:Int=0){

}
