package org.example.fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    // semelhante ao switch case de outras linguagens
    return when (numero) {
        1 -> "Um"
        2 -> "Dois"
        3 -> "Tres"
        4 -> "Quatro"
        5 -> "Cinco"
        else -> "Numero fora do intervalo"
    }
}

fun main() {
    println(retornaNumeroPorExtenso(5))
}