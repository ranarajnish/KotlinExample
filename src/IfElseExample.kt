import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter two numbers->")
    val num1 = reader.nextInt()
    val num2 = reader.nextInt()
    val result = if (num1>num2){
        "$num1 is greater than $num2"
    }else{
        "$num1 is less than $num2"
    }
    print(result)
}