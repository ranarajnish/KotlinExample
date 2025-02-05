fun main() {
    example1()
    example2()
    example3()
}
//List
fun example1(){
    val greenNumbers = listOf(1,3,5,6)
    val redNumbers = listOf(23,45,32,12,78)
    println("The total number of elements->${greenNumbers.count()+redNumbers.count()}")
}
//set
fun example2(){
    val supported = setOf("HTTPS","HTTP","FTP")
    var requested = "smtp"
    requested = requested.uppercase()
    val isSupported = requested in supported
    if (isSupported){
        println("System supports the protocol")
    }else{
        println("It doesn't support protocol")
    }

}
//map
fun example3(){
    val numberToWord = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("Number $n is to be written as ${numberToWord[n]}")
}