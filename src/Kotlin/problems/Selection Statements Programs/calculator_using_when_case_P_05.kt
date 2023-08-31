package Kotlin.problems.`Selection Statements Programs`

import java.util.*

fun main() {
    var num1=0
    var num2=0
    var result=0
    var input = Scanner(System.`in`)
    println("enter 1st number:")
     num1= input.nextInt()
    println("enter 2nd number:")
    num2= input.nextInt()
    println("enter Symbol(+,-,*,/):")
    var sym =input.next()

    when(sym){
        "+"->{
            result = num1 + num2
            println(result)
        }
        "-"->{
            result = num1 - num2
            println(result)
        }
        "*"->{
            result = num1 * num2
            println(result)
        }
        "/"->{
            result = num1 / num2
            println(result)
        }
        else ->{
            println("Invalid Symbol")
        }
    }

}