package fundamentos

fun main() {

    // Em kotlin quando queremos criar uma variavel usamos a palavra chave var
    var counter: Int = 10  // Definimos explicitamente a tipagem da variavel, podemos atribuir o valor agora ou depois

    var counter2: Int = 15 // Aqui estamos atribuindo o valor na mesma linha

    var counter3 = 10 // Dessa forma está sendo feita de forma implicita

    var counter6: Double = 22.2

    // Melhor que seja sempre declarado pela forma implicita , por causa do inference type.
    // Usar tambem sempre val como declaracao padrao



    // Diferente do var o val é uma constante, ou seja, ela nao permite reatribuicao do valor uma vez que ele é definido
    val counter4: Int = 30 // Explicito
    val counter5 = 30 // Implicito

}