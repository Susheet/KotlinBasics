fun main(){
    greeting(
        "How are you",            //named args passed only after unnamed
        name = "Hans",
        reps = 3
    )
}

fun greeting(message:String, name:String="user",reps:Int=1){
    for(i in 0 until reps) println("Hello, $name! !message")
}