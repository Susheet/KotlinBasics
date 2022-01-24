class LateInt {
}

fun main(){
    var declaration = Declaration()

    //declaration.setValue("SK)
    println(declaration.getValue())

    //val user = userDetails("SK",22)
    val user : userDetails by lazy{userDetails("SK",22)} //lazy cannot be used with var but only val
    println(user.toString())

    
}

class Declaration{
    lateinit var myName: String  //lateinit cannot be applied to val but only var

    fun setValue(name:String){
        myName = name
    }

    fun getValue(): String {
//        if(myName.isInitialized)
        if(this::myName.isInitialized){
            return this.myName
        }
        else{
            return "not initialized"
        }
    }
}

class userDetails(val name: String, val age: Int){
    init{
        println("The name is $name")
        println("The name is $age")
    }
}