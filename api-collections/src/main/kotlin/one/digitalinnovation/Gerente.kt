package one.digitalinnovation

import one.digitalinnovation.digionebank.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoauxilio(): Double = salario * 0.4
    }
