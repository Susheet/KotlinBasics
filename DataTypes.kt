fun main(){
    val exampleString = "SK"
    val exampleNumber: Int = 28

    val exampleLong: Long = exampleNumber.toLong()

    val exampleChar = 'a'
    val exammpleInt: Int = exampleChar.code  //same as exampleChar.toInt()

    val exampleBoolean = false

    val exampleString2 = "\"Walter \n Lewis\""
    println(exampleString2)

    val exampleRawString: String = """How is this going to work
        |wow
    """.trimMargin()
    println(exampleRawString)
}