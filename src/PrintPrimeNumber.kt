import java.util.*
private var count = 0
fun main() {
    val reader = Scanner(System.`in`)
    print("Enter the range ->")
    val num1 = reader.nextInt()
    print("All prime number up to $num1 are\n")
    for (x in 2..num1){
        checkPrime(x)
        }
    println("\n Total prime numbers are $count")
}

fun checkPrime(num2 : Int){
    var flag = 0
    for (x in 2..<num2){
        if(num2 % x == 0){
            flag = 1
            break;
        }
    }
    if (flag==0){
        print("  $num2")
        count ++
        if (count%5==0){
            println()
        }
    }

}