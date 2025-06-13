package fundamentos

fun main() {

    //Crie um programa que possa imprimir a quantidade de caracteres do seu nome e também qual será a sua idade no ano 2050.

    val nome: String = "Lucas Winicius"
    val yearOfBirth: Int = 1999
    val year: Int = 2050

    println("Olá $nome em 2050 voce tera ${year - yearOfBirth} anos de idade. Seu nome possui ao todo ${nome.length} caracteres.")
}