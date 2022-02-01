package Excercise

fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

   val sum = a + b

    print("$sum".padStart(7,'0'))
}