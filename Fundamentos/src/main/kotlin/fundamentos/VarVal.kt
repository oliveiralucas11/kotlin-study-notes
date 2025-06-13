package fundamentos

fun main() {

    // Em kotlin quando queremos criar uma variavel usamos a palavra chave var
    var counter: Int  // Definimos explicitamente a tipagem da variavel, podemos atribuir o valor agora ou depois
    counter = 10

    var counter2: Int = 15 // Aqui estamos atribuindo o valor na mesma linha

    var counter3 = 10 // Dessa forma está sendo feita de forma implicita



    // Diferente do var o val é uma constante, ou seja, ela nao permite reatribuicao do valor uma vez que ele é definido
    val counter4: Int = 30 // Explicito
    val counter5 = 30 // Implicito

}