fun main() {
    var x =5;
    println("The Object refernec of x=$x is "+System.identityHashCode(x).toString())
    var y = x;
    println("The Object refernec of y=$y is "+System.identityHashCode(x).toString())
    y = 10
    println("The Object refernec of x=$x is "+System.identityHashCode(x).toString())
    println("The Object refernec of y=$y is "+System.identityHashCode(x).toString())
}