package fundamentos

// Crie um programa que contenha um número inteiro e um texto que representa um número. Seu objetivo é somar esses dois valores, mas você precisará converter os tipos corretamente antes de realizar a operação.
//
//
//A variável de resposta deve ter o valor: 45

fun main() {

    val soma: Int = 20
    val soma1: String = "25"

    var conversao = soma1.toInt()
    var resultado = soma + conversao

    println("O resultado é: $resultado")

}