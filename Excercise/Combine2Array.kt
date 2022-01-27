package Excercise


fun main(){
    var a = listOf(1,7,4)
    var b = listOf(6,3,2)


    var merged = a + b

    println(merged)

    println(merged.sorted())

    var filt = merged.filter{it-> it%2 != 0}
    println(filt)






}