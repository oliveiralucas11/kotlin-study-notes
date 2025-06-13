package fundamentos

fun main() {

    val name = "Lucas Oliveira"
    name.length // pra descobrir a quantidade de caracteres tem nossa variavel

    println("Ola pessoa".length)

    val newName = name.uppercase() // Vai pegar todos os caracteres da variavel e transformar em maiusculo
    val newName2 = name.lowercase() // Vai transformar os caracteres da variavel em minusculo
    print(name)


    // Formatacao de textos

    // 1. Um dos jeitos de formatarmos é usando a quebra de linha \n
    val message = "Ola Lucas. \nSeu produto Chegou"
    println(message)

    // 2. Outro jeito é usarmos aspas triplas , podendo formatar o texto conforme a gente escreve ele
    val welcome = """
            Ola lucas.
            Seu produto chegou!
        """.trimIndent() // Usamos o trimident pra indentar e formatar o codigo fonte e nao ficar espacos na compilacao.
           .replaceIndent(";") // Usamos para trocar todo o espaco de identacao por algum caractere ou texto

    // Ele vai imprimir como se tivesse formatado exatamente da maneira como foi digitado

    // 3.
    val nome = "Lucas"
    val age = 24
    val price = 19.90
    println("Ola, $nome. Sua idade é $age. Seu desconto é: $price e seu nome tem ${name.length} caracteres")

    println("Ola, $nome. Sua idade é ${age + 10}. Seu desconto é: $price")


}