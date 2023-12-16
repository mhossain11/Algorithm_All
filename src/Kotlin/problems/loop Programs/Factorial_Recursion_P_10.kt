package Kotlin.problems.`loop Programs`

fun main() {
    val num = 5
    val fr = Factorial_Recursion()
    val result = fr.calfact(num)
    println("Factorial of the Number :$result")


}

class Factorial_Recursion{
    var fact = 1

    fun calfact(i:Int):Int{ //1x2x3x4x5=120
        if(i>=1){
            fact*=i
            calfact(i-1)
        }
        return fact
    }

}