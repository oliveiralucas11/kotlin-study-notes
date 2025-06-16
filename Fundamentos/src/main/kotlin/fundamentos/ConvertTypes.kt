package fundamentos


fun main() {

    val mediaDePreco: Int = 22

    // Convertendo tipo int para double
    val resposta = mediaDePreco.toDouble()

    // Convertendo int para string
    val resposta2 = mediaDePreco.toString()

    // Convertendo int para long
    val resposta3 = mediaDePreco.toLong()

    // Convertendo int para float
    val resposta4 = mediaDePreco.toFloat()

    println(resposta)
    println(resposta::class)
    println(resposta2)
    println(resposta2::class)


}