package Kotlin.problems.`loop Programs`

fun main() {
    var temp = 0

    for (i in 1..100) {
        for (j in 2 until i) {
            if (i % j == 0) {
                temp += 1
            }
        }
        if (temp == 0) {
            println("Numbers are prime $i")
        } else {
            temp = 0
        }
    }
}