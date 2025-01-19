import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a number->")
    var x = reader.nextInt()
    if(x%2 == 0){
        println("The number $x is even")
    }else{
        println("The number $x is odd")
    }
}