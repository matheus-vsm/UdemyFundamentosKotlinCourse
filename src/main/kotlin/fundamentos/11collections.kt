package org.example.fundamentos

fun main(){
    var lista = listOf(1, 2, 3) // lista imutavel
    var pares = lista.filter { it % 2 == 0 }.first()
    println(pares)
    println()
    lista.forEach { println(it) }
    println(lista.get(0))
    println(lista[0])

    var listaMutavel = mutableListOf(1, 2, 3) // lista mutavel
    println(listaMutavel)
    listaMutavel.add(4)
    println(listaMutavel)
    listaMutavel.removeAt(0)
    println(listaMutavel)
    listaMutavel.remove(3)
    println(listaMutavel)

    var lista2 = mutableListOf(1, 9, 2, 3, 842, 201, 96231, 45)
    println(lista2)
    lista2.sort()
    println(lista2)
    lista.shuffled() // embaralha a lista
    println(lista2)


    var setNumeros = setOf(1, 2, 3, 2) // imutavel e nao recebe valores duplicados
    println(setNumeros)
    var setNumeros2 = mutableSetOf(1, 2, 3, 2) // mutavel e nao recebe valores duplicados
    println(setNumeros2)


    var mapNomeIdade = mapOf("Matheus" to 26, "Alice" to 25) // imutavel
    println(mapNomeIdade)
    var mapNomeIdade2 = mutableMapOf("Matheus" to 26, "Alice" to 25) // mutavel
    var mapNomeIdade3 = mutableMapOf<String, Int>() // mutavel vazio
    mapNomeIdade3["Matheus"] = 23
    mapNomeIdade3["Alice"] = 22
    println(mapNomeIdade3)
    mapNomeIdade3["Alice"] = 23 // atualiza o valor pois não pode ter chave duplicada
    println(mapNomeIdade3)
    mapNomeIdade3.putIfAbsent("Matheus", 29) // so adiciona se a chave nao existir
}