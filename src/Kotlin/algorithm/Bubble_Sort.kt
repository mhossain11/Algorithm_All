package Kotlin.algorithm

fun main() { 
    val srt = arrayOf(19,30,4,40,1) //1,4,19,30,40
    var temp=0


    for (i in 0 ..srt.size){  //number of round
        for (j in 0 until srt.size-1){//Two adjustment element

            if (srt[j]>srt[j+1]){
                temp =srt[j]
                srt[j]=srt[j+1]
                srt[j+1]=temp

            }
        }

    }
    for (i in 0 until  srt.size){
        print("${srt[i]} " )
    }

}