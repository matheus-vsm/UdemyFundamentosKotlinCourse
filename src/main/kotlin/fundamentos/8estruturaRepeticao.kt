package org.example.fundamentos

fun printa1a10() {
    for (num in 1..10) {
        println(num)
    }
}

fun printa10a1()  {
    for (num in 10 downTo 1) {
        println(num)
    }
}

fun printaPar1a10() {
    for (num in 1..10 step 2) {
        println(num)
    }
}

fun printRange(inicio: Int, fim: Int) {
    for (num in inicio..fim) {
        println(num)
    }
}

fun whileMenorQue10() {
    var num = 0
    while (num < 10) {
        println(num)
        num++
    }
}

fun doWhileMenorQue10() {
    var num = 0
    // executa ao menos uma vez
    do {
        println(num)
        num++
    } while (num < 10)
}

fun main() {
    printa1a10()
    println()
    printa10a1()
    println()
    printaPar1a10()
    println()
    printRange(5, 15)
    println()
    whileMenorQue10()
    println()
    doWhileMenorQue10()
}