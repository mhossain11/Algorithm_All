package Kotlin.problems.`loop Programs`

fun main() {
    var fact =1
    val num=5

    for (i in num downTo 1){
        fact *= i //if fact =0 then result will be 0 because fact =0 x i=0
    }

    println("Factorial of the $num!: $fact")
}