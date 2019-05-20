open class Book(var title:String, var author:String){
    var currPage: Int=0
    open fun readPage(){
        currPage.inc()
    }
}

class Ebook(var format: String="text", title: String, author: String): Book(title, author){
    var word:Int=0
    override fun readPage() {
        currPage=+250
    }


}