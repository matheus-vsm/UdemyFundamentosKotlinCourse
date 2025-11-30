package org.example.fundamentos

fun retornaNome(): String {
    return "Matheus"
}

// idade tem valor padrao 30 caso nao seja passado nada
fun dizOi(nome: String, idade: Int = 30) {
    println("Oi $nome vc esta com $idade anos")
}

fun main() {
    println("Nome: ${retornaNome()}")
    dizOi(retornaNome(), 22)
    dizOi(idade = 24, nome = "Alice") // parametros fora de ordem
    dizOi(idade = 27, nome = retornaNome())
    dizOi("Renato") // idade padrao 30
}