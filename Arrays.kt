fun main(){
    val names: Array<String> = arrayOf("Jim","John","Jenny")

    println("number of elements: ${names.size}")
    println("First element: ${names[0]}")

    names[0] = "Jeremy"
    println(names[0][2])
    println("Last element of array : ${names[names.size-1]}")
    //can used mixed type too
    val numbers = arrayOf(1,"Hi")

    //2D arrays
    val num = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )

    println(num[1][1])



}