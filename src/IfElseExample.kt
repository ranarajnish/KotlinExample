import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter two numbers->")
    val num1 = reader.nextInt()
    val num2 = reader.nextInt()
    if (num1>num2){
        print("$num1 is greater than $num2")
    }else{
        println("$num1 is less than $num2")
    }
}