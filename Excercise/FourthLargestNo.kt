package Excercise
import java.util.*;
import kotlin.collections.*;

fun main(){
    val scn = Scanner(System.`in`)

    var inp = ArrayList<Int>()
    println("Enter numbers:")

    while(scn.hasNextInt()){
        inp.add(scn.nextInt())
    }

    if(inp.size <4)
        println("Please try again and enter more elements")
    else {
        inp.sort()
        println(inp[(inp.size - 4 + 1)])
    }







}