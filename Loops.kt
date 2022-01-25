fun main(){
    val names = arrayOf("Jim","John","Jenny","Jeremy","Jaimie")

    for(name in names){
        println(name)
    }

    val chars = "Hello"

    for(c in chars)println(c)

    for(i in 1..10)println(i) //also can write as for(i in 1 until 10) excludes 10 though

    //backward counting
    for(i in 10 downTo 1)println(i)

    //can also write loop as
    for(i in 1.rangeTo(10).step(2))println(i)

    for(index in names.indices){
        println("Index: $index Element: ${names[index]}")
    }
}