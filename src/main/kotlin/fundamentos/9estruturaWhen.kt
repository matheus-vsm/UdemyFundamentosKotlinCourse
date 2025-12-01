package org.example.fundamentos

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.uppercase().startsWith("OI")
        else -> false
    }
}

fun main() {
    val x = 5
    when (x) {
        5 -> println("x é igual a 5")
        6, 7, 9 -> println("x é igual a 6, 7 ou 9")
        8 -> println("x é igual a 8")
        10 -> {
            println("x é igual a 10")
            println("x é uma dezena")
        }
        in 11..20 -> println("x está entre 11 e 20")
        !in 21..30 -> println("x não está entre 21 e 30")
        else -> println("x não é nem 5 nem 10")
    }

    println(comecaComOi("Oi, tudo bem?"))
    println(comecaComOi("oi, tudo bem?"))
    println(comecaComOi(63))

    when {
        comecaComOi(5) -> println(println(5))
        comecaComOi("oi, tudo bem?") -> println("oi, eu estou bem, e vc?")
    }
}