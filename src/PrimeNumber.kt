import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var flag = 0
    print("Enter a number ->")
    val num1 = reader.nextInt()
    for (x in 2 until num1){
        if(num1%x==0){
            println("The given number $num1 is not a prime number")
            flag =1
            break;
        }
    }
    if (flag == 0){
        print("The given number $num1 is a prime number")
    }
}