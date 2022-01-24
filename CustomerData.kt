class CustomerData {
    companion object {   //object inside a normal class : companion object
        var id_no: Int = -1    //behaves like static

        fun registerMe(){
            println(" I am registered.")
        }
    }
}

fun main(){
    println(CustomerData.id_no)
    CustomerData.registerMe()

}