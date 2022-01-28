package Excercise

fun main(){
    var h = HashMap<Char,Int>()

    for(i in 1..10)
    {
        var c = (64+i).toChar()
        h.put(c,i)
    }
    //print(h)
    var res = h.toList().sortedBy { (_,value)->value }.toMap()

    for(r in res)
    {
        print("${r.key} : ${r.value} ")
    }
    println()
    //filtering a map
    for(r in res)
    {
        if(r.value >= 5)
        {
            println("${r.key} : ${r.value} ")
        }
    }


}