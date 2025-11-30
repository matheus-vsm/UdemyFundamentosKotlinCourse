package org.example.fundamentos

class Carro(var cor: String, val anoFabricacao: Int, var dono: Dono) {

}

class Dono(var nome: String, var idade: Int) {

}

fun main() {
    val carro = Carro("Vermelho", 2020, Dono("Matheus", 22))
    println(carro.cor)

    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono.nome)
    carro.dono.nome = "Alice"
    println(carro.dono.nome)
}