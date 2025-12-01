package org.example.fundamentos

fun main() {
    var nome: String? = "Matheus" // declaracao explicita com null safety
    nome = null // agora pode receber null

    println(nome?.length) // safe call, so acessa length se nome nao for null
    val toShort: Short = nome!!.length.toShort() // !! garante que as variaveis nao sao null

    var nomezin: String? = "Alice"
    var tamanho: Int = nomezin?.length ?: 0 // elvis operator, se nomezin for null, tamanho sera 0

    var lista: List<Int?> = listOf(1, 2, null, 4) // lista que pode conter nulls
    var listaNullable: List<Int>? = null // lista que pode ser null
    var listaNullable2: List<Int?>? = null // lista que pode ser null e conter nulls
}