//Data class - class to hold data
fun main(){
    val userOne = User("SK")
    println(userOne)
    println(userOne.userName)

    //generates as many components as no of params in constructor
    println(userOne.component1())
    println(userOne.component2())

    val userTwo = userOne.copy(age = 45)
    println(userTwo)

    //can be used in destructuring too
    val(uname,age) = userTwo
    println(uname)
    print(age)
}

data class User(val userName:String, val age:Int = 30)