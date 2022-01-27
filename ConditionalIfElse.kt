fun main()
{
    for(i in 1..10){

        //if(i in 4..7) continue

//        (4..7).contains(i)
//      if(i !in 4..7) print("-") else print(">")
//        println(i)

        //we can assign values using if else
        val prefix = if(i !in 4..7) "-" else "."
        print("$prefix$i")
    }
    println()
    for(i in 10 downTo 1){

        val prefix = if(i == 1){
            "*"
        } else if( i !in 4..7){
            "-"
        }else{
            print("-")
            ">"
        }

        println("$prefix$i")
    }


}