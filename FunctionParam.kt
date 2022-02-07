fun main(){
    greet("SK",3)
    printMax(12,2)
    val max = getMax(12,2)
    println(max)
    println(double(12))
}

//fun double(num:Int): Int{
//    return num*2
//}
//single expresssion function
fun double(num: Int) = num*2

fun printMax(num1: Int, num2: Int){
    val max = if(num1 > num2) num1 else num2
    print(max)
}

fun getMax(num1: Int,num2: Int): Int{
   val max = if(num1 > num2) num1 else num2
   return max
    println("This will be unreachable any statement after return does not run")
}

fun greet(name:String,reps: Int){
    for(i in 1..reps)
        println("hello $name Nice to meet you")
}

