fun main(){
    val time = 14

    val greeting = when(time){
        in 0..5 -> "why up so early?"
        in 0..1 -> "Good Morning!"
        12 -> "Time for lunch!"
        13,14 -> {                    // 13,14 behaves as 13 or 14
            println("Yawn..")
            "time for a nap"
        }
        else -> "Good day"
    }

    print(greeting)
}