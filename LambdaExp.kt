fun main(){
    //lambda
    val square : (Int) -> Int = { number ->
        number*number
    }

    val printName: (String) -> Unit ={
        println(it)
    }

    printName("Susheet")
}