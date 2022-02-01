package Excercise

fun main()
{
    val n = readLine()!!.toInt()
    //avoid any overflow error
    if(n%2 == 0)
        print((n/2)*(n+1))
    else
        print(((n+1)/2)*n)

}