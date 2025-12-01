package org.example.fundamentos

class variaveis {
    lateinit var teste: String
    fun iniciar() {
        teste = "teste"
        println(teste)
    }
}

fun main() {
    var Var = "Mutavel, ou seja, pode mudar"
    val Val = "Imutavel, ou seja, nao pode mudar"

    var nome: String = "Matheus" // declaracao explicita
    var idade: Int = 22 // declaracao explicita
}