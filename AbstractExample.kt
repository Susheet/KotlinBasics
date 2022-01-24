class AbstractExample {
}

abstract class Person{      //cannot create instance of abstract classs

    abstract var id: Int
    open var name: String = "SK"

    abstract fun eat()      //abstract properties are open by default
    open fun getHeight(){}  // a open function can be overridden
    fun goToSchool(){   // a normal function: public and final by default
    }
}

class Indian: Person(){
    override var id: Int = 1
    override  var name: String = "Kumar"

    override fun eat(){
    }

//    override fun getHeight() {
//    }

}

fun main(){
    var person = Indian()

}