
fun main(){
    println(getSum(1,2,3,4,5))

    //to convert a normal array to pass it as a vararg array to a function
    val array = intArrayOf(6,7,8,9)
    println(getSum(*array)) //* is a spread operator
}

fun getSum(vararg numbers: Int): Int{
    var sum = 0
    for(number:Int in numbers) sum += number
    return sum
}