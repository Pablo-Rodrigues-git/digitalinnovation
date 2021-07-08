package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.Gerente

fun main () {
    val maria = Gerente("Maria do Carmo",  "123456789", 5000.0,"senha123" )

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}
