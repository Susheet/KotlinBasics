fun main(){
    val emp = Employee()
    emp?.age = 20
    emp?.name = "John"


    //apply saves some keystrokes no need to write this or class name again and again, returns object
    emp.apply {
        age = 30
        name = "Sean"
    }

    println(emp.age)
    println(emp.name)

    //it allows to access properties and last statement is return statement if assigned to a variable
    //also checks null value
    emp?.let{
        println(it.name)
        println(it.age)
    }

    //same as let but uses this to refer to object attributes and last statement is return statement if assigned
    with(emp){
        age = 30
        name = "xyz"
    }

    //run = with + let
    emp.run {
        age = 35
        name = "pqr"
    }

}

data class Employee(var name: String = "",var age: Int = 18)