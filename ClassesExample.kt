class ClassesExample(val name: String) {   //primary constructor next to class name
    //val name: String = "something"
      var id: Int = -1
    init{
        //use this block for initialising the fields
        //this.name = name
        println("Print my name: $name and id: $id")
    }
    constructor(name: String, id: Int): this(name){ //secondary constructor, will have to call primary
                                                    // constructor via this(n) otherwise compile time error
        //body of secondary constructor is called after init block
        this.id = id
    }
}

object StaticLike{        //object keyword creates a singleton object internally for us
    var id_no: Int = -1   //behaving as static variable
    init{}
    fun registerMe(){     //behaving as static method
      println(" I am registered and my id is : $id_no")
    }
}

fun main(){
    val obj = ClassesExample("SK")
   //println("Print ${obj.name}")
    val obj2 = ClassesExample("SK",10)
    println("this is the id: ${obj2.id}")
   StaticLike.id_no = 11   //calling without creating instance
   StaticLike.registerMe()
  StaticLike.id_no = 12
    StaticLike.registerMe()
}