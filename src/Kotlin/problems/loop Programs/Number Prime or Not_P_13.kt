package Kotlin.problems.`loop Programs`

fun main() {
    val num=7
    var temp=0

    for (i in 2..num-1){
        if(num%i==0){
            temp+=1
        }
    }
    if (temp>0){
        println("$num is not Prime number")
    }
    else{
        println("$num is Prime number")
    }
}