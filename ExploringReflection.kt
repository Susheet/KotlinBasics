
fun main(){
    val myList = listOf(1,2,3,4,5,6,7)

    val functions = myList::class.qualifiedName
    println(functions)

}