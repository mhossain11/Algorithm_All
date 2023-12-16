package Kotlin.problems.`Selection Statements Programs`

// Check for leap year
fun main() {
    var year =2016
    if (year % 400 ==0 || (year % 4==0 && year % 100 !=0) ){
        println("Leap Year");
    }else {
        println("Not a leap year");
    }
}