fun main() {
    specialoperator()
}
fun specialoperator(){
    // Without ? marks name can't be null
    val name : String? = null
    println(name)
    //This !! operator will throw null pointer expresion
    //println(name!!)
}
fun specialoperator(name: String): Unit {

  }