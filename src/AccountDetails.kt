import java.util.Scanner

class  AccountDetails{
    //By default public
    var account_no : Int = 0
    var account_name : String ?= null
    var balance : Float = 0.00f
    //private variable
    var account_no1 : Int = 0
    private var account_name1 : String ?= null
    private var balance1 : Float = 0.00f

    fun createAccount(){
        val scanner = Scanner(System.`in`)
        print("Enter Account Name->")
        account_name1 = scanner.nextLine()
        print("Enter Account No->")
        account_no1 = scanner.nextInt()

        scanner.reset()
        print("Enter Account Balance->")
        balance1 = scanner.next().toFloat()
    }
    fun  displayAccount(){
        println(" Account No->$account_no1")
        println(" Account Name->$account_name1")
        println(" Account Balance->$balance1")
    }
    fun depositeAmt(){
        val scanner = Scanner(System.`in`)
        print("Enter Amount to Deposit->")
        val amt = scanner.nextFloat()
        balance1 += amt
    }
    fun withdrawAmt(){
        val scanner = Scanner(System.`in`)
        print("Enter Amount to Deposit->")
        val amt = scanner.nextFloat()
        balance1 -= amt
    }
}
