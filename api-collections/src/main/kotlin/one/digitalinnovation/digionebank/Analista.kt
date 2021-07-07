package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double,): Funcionario(nome, cpf, salario) {
    override fun calculoauxilio() = salario * 0.1
}