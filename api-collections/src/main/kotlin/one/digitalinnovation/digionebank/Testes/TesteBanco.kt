package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Banco

fun main() {

    //"recursos nomeados utilizando ="
    val digioneBank = Banco(nome = "Digione", numero = 12)

    println(digioneBank.nome)
    println(digioneBank.numero)

    //Alterando o data class através de cópia
    val banco2 = digioneBank.copy(nome =  "Banco2")

    println(digioneBank.info())


}