package fundamentos

fun main() {

    // Declaracao de uma variavel de tipo unico caractere
    val char: Char = 'A' // 2 bytes (0 - 65535 spaces) nao permite caracteres negativos
    print(char::class) // Usado para descobrir o tipo da variavel usando ::class

    // Declaracao de variavel de estado booleano true ou falso
    val boolean: Boolean = true
    val booleanFalse: Boolean = false // 1 "byte"

}