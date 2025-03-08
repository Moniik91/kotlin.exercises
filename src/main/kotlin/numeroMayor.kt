package org.example

fun main() {
    val lista = arrayOf(-100, 1,3,5,7,-3,-1,4)
    var numeroMayor = lista[0]
    var numeroMenor = lista[0]

    for (numero in lista){
        if(numero > numeroMayor)
            numeroMayor = numero
        }
        println("El numero mayor es: $numeroMayor")
        for (numero in lista){
            if(numero < numeroMenor)
                numeroMenor = numero
        }
        println("El numero menor es: $numeroMenor")
    }
