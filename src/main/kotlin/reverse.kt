package org.example

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in array)
        print("$i,")

    //for(i in 0..array.size)
       // print(":$i")
        println("\n[")
    for (i in array.size downTo 1) {
        print("$i,")
    }
    print("]")
}
