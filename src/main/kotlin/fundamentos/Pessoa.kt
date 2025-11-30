package org.example.fundamentos

// propriedades e construtor
class Pessoa(val nome: String, val idade: Int) {
    override fun toString(): String {
        return "Nome da Pessoa é $nome e a Idade é $idade"
    }
}

fun main() {
    val pessoa = Pessoa("Matheus", 30)
    println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")
    println(pessoa)
}