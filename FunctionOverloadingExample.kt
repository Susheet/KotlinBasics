fun main(){
    println(getMaximum(11.5,5.3))
}

fun getMaximum(a:Int,b:Int) = if(a > b) a else b

fun getMaximum(a:Double,b:Double) = if(a > b) a else b

fun getMaximum(a:Int,b:Int,c:Int) =
    when{
        a >= b && a >= c -> a
        b >= a && b>= c -> b
        else -> c
    }