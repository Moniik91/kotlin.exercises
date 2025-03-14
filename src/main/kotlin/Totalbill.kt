//*
//* Complete the 'bonAppetit' function below.
//* The function accepts following parameters:
//*  1. INTEGER_ARRAY bill
//*  2. INTEGER k
//*  3. INTEGER b
//*/

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    // Write your code here
    val totalAmount = bill.sum() - bill[k]
    val anaPays = totalAmount/2

    if (b == anaPays){
        print("Bon Appetit")
    } else{
        println(b - anaPays)
    }

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
