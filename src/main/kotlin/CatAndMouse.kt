package org.example

fun catAndMouse(x: Int, y: Int, z: Int) : String {
    val distanceA = (x - z)
    val distanceB = (y - z)

//    if (distanceA < distanceB) {
<<<<<<< HEAD
//        return "Cat A"
//    } else if (distanceB < distanceA) {
//        return "Cat B"
//    } else {
//        return "Mouse C"
=======
//        return "Cat A"  
//    } else if (distanceB < distanceA) {
//        return "Cat B"  
//    } else {
//        return "Mouse C" 
>>>>>>> beb2815c3d29eee71784cc2b655b7ce490af0365
//    }

    when{
        distanceA < distanceB -> {
            return "Cat A"
        }
        distanceB < distanceA -> {
            return "Cat B"
        }
        else -> {
            return "Mouse C"
        }
    }
}



fun main(args: Array<String>) {
    println(catAndMouse(3,5,4))

//    val scan = Scanner(System.`in`)
//
//    val q = scan.nextLine().trim().toInt()
//
//    for (qItr in 1..q) {
//        val xyz = scan.nextLine().split(" ")
//
//        val x = xyz[0].trim().toInt()
//
//        val y = xyz[1].trim().toInt()
//
//        val z = xyz[2].trim().toInt()
//
//        val result = catAndMouse(x, y, z)
//
//        println(result)
//    }
}
