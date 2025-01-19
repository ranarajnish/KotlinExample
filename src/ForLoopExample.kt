fun main() {
    printNumber()
    ultiGinti()

}
//Function to print number upto 20
fun printNumber(){
    for (x in 1 until 20){
        println(x)
    }
}
fun ultiGinti(){
    for (x in 15 downTo 1){
        println(x)
    }
}