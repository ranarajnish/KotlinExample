import java.util.Scanner

fun main() {
    print("Enter your name : ")
    val name = readln()
    print("your name is $name")

    //Taking input using Scanner class
    println("Enter a number : ")
    val reader = Scanner(System.`in`)
    val num1 = reader.nextInt()
    print("you have Entered $num1")
}