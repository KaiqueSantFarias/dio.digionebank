package one.digitalinnovation.digionebank

// Objeto Pessoa
class Pessoa {

    // Propriedades
    var nome: String = "João"
    var cpf: String = "123.456.789-66"

}
fun main(){
    val joao = Pessoa() // Criação de uma variável que recebe a Instância de uma Pessoa

    println(joao.nome)
    println(joao.cpf)
} 