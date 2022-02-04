package Excercise

fun main()
{
    var mp1 = HashMap<Char,Int>()
    var mp2 = HashMap<Char,Int>()
    var mp3 = HashMap<Char,Int>()
    var filteredmap = HashMap<Char,Int>()

    for (i in 1..5)
    {
        var c = (64+i).toChar()
        mp1.put(c,i)
    }

    for (i in 6..10)
    {
        var c = (64+i).toChar()
        mp2.put(c,i)
    }

    mp3 = (mp1 + mp2) as HashMap<Char, Int>
    println(mp3)

    for(k in mp3){
        if(k.value %2 == 0){
            filteredmap.put(k.key,k.value)
        }
    }

    println(filteredmap)
}