fun main(){
    val sum = Human.add(5,7)
    println(sum)
}

class Human(val name:String){

    companion object{
        fun add(num1:Int,num2:Int) = num1.plus(num2)
    }

    constructor(name:String, age:Int) : this(name){
       println("Secondary constructor called")
    }
}