package Kotlin.problems.`loop Programs`

import java.util.*

fun main() {
var input = Scanner(System.`in`)
var num=0
var result =0

println("enter number of table:")
num = input.nextInt()
for (i in 1..10){
    result = num * i
    println("$num X $i = $result")
}
}