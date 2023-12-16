package Kotlin.problems.`loop Programs`

fun main() {
    var num = 543210
    var rev:Int
    var temp=0

    while (num!=0){
        rev=num%10
       temp = temp*10+rev
       num=num/10
    }
    println(temp)
}