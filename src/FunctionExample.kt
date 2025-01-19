import java.util.Scanner

fun main() {
    // Simple Addition using Function
    val reader = Scanner(System.`in`)
    print("Enter First Number -> ")
    val num1 = reader.nextInt()
    print("Enter Second number ->")
    val num2 = reader.nextInt()
    val add = sumTwo(num1,num2)
    println("The addition of two number $num1 and $num2 is $add")
}
fun sumTwo(x: Int, y: Int): Int {
    return x+y
}
