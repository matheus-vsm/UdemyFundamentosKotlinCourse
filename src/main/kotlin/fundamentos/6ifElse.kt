package org.example.fundamentos

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}

fun resultadoDaNota(nota: Int): String {
    return if (nota >= 6) {
        "Aprovado"
    } else if (nota >= 4) {
        "Recuperacao"
    } else {
        "Reprovado"
    }
}

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(3))

    println("\n${resultadoDaNota(6)}")
    println(resultadoDaNota(4))
    println(resultadoDaNota(2))
}