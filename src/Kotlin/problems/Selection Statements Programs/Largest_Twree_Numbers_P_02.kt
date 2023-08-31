package Kotlin.problems.`Selection Statements Programs`
//I.	Find the largest of three numbers
fun main() {
    val a = 30
    val b = 20
    val c = 40

    if (a > b && a > c) {
        println("a is greater")
    } else if (b > a && b > c) {
        println("b is greater")
    } else {
        println("c is greater")
    }
}