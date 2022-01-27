package Excercise
import java.util.Scanner


fun main(){
    val scn = Scanner(System.`in`)

    var n = scn.nextInt()
    var rev = 0
    while(n > 0)
    {
        rev = (rev*10) + (n%10)
        n /= 10
    }
    print(rev)

}