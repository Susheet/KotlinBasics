package Excercise

fun main(){
    var s = readLine()!!

    var c = s.toCharArray()
    var h = HashMap<Char,Int>()

    for(i in 0..s.length-1)
    {
        if (h.containsKey(c[i]))
        {
            h.get(c[i])?.let { h.put(c[i], it.plus(1)) }
        }
        else{
            h.put(c[i],1)
        }
    }

    for(k in h.keys)
    {
        if(h[k]!! > 1)
        println("$k is repeated ${h[k]}")
    }


}