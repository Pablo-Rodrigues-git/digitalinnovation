package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Analista

fun main () {
    val joao = Analista("Joao Pedro",  "123456789", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
