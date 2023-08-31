package Kotlin.problems.`loop Programs`

fun main() {
    var name ="EDCBA"
    var rev=""

    for (i in name.length-1 downTo 0){

        rev += name[i]

    }
    print(rev)
}