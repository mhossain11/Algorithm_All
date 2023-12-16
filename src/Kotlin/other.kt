package Kotlin

fun main() {

  var  sum =0.0
    var qun=0.0
  var  quntiti =2
    var list :ArrayList<String> =ArrayList()

    list.add(0,"100",)
    list.add(1,"200",)

    for (e in list){
      qun = e.toDouble() * quntiti
      sum += qun
    }
    println(sum)

}


