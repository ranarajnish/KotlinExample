import java.util.Scanner

class ShowMenu {
    private val accountList = mutableListOf<AccountDetails>()
    private var scanner = Scanner(System.`in`)
    private final var option : Int = 0
    fun menuoption(){
        while (true){
            println("************************")
            print("1->Create Account" +
                    "\n2->Display All Account" +
                    "\n3->Search Account" +
                    "\n4->Delete Account" +
                    "\n5->Exit" +
                    "\n\tEnter your choice->")
            option = scanner.nextInt()
            when(option){
                1 -> createAccount()
                2 -> displayAllAccount()
                3 -> searchAccount(getAccountno())
                4 -> deleteAccount(getAccountno())
                5-> System.exit(0)
                else -> println("Wrong Option")
            }
        }
    }
    private fun createAccount(){
        val accoundetails = AccountDetails()
        accoundetails.createAccount()
        accountList.add(accoundetails)
        println("Account Created Successfully")
    }
    private fun displayAllAccount(){
        for (acctlist in accountList){
            println("***************************")
            acctlist.displayAccount()
        }
        println("***************************")
    }
    private fun getAccountno () : Int{
        print("Enter Account No->")
        val acc = scanner.nextInt()
        return acc
    }
    private  fun searchAccount(acc:Int){
        var accountDetails : AccountDetails? = null
        for (acctlist in accountList){
            if (acctlist.account_no1 == acc){
                accountDetails = acctlist
                acctlist.displayAccount()
                break;
            }
        }
        println("\t1-> To Deposite" +
                "\n\t2 -> withdraw")
        val opt = scanner.nextInt()
        if (opt == 1){
            accountDetails?.depositeAmt()
        }else if (opt ==2){
            accountDetails?.withdrawAmt()
        }
        accountDetails?.displayAccount()


    }
    private  fun deleteAccount(acc:Int){
        var i = 0
        for (acctlist in accountList){
            if (acctlist.account_no1 == acc){
                accountList.removeAt(i)
                println("AccountDeleted Succesfully")
                break;
            }
            i++
        }
    }
}