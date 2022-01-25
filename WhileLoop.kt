fun main(){
//    var i = 0
//    while(i < 5){
//        println(i)
//        i++
//    }

    var i = 0

    outer@ do{
        println(i)
        i++
       // continue


        var j = 0
        while(j < 5){
            println("----$j")
            j++
            break@outer
            println("I am not printed")
        }

        println("I am printed")
    }while(i < 5)
}