fun  main(){
    // Faça um Programa que peça dois números e imprima o maior deles.
    println(">> Vamos descobrir o maior número INTEIRO que você digitou!! <<")
    println("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    if (num1 > num2)
        println("O número $num1 é maior que o número $num2")
    else if (num1 == num2)
        println("Os números que você digitou são iguais!")
    else
        println("O número $num2 é maior que o número $num1")

    //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
    println("\n>> Vamos descobrir se o número é POSITIVO ou NEGATIVO <<")
    println("Digite o número: ")
    val num = readLine()!!.toInt()
    if (num >= 0)
        println("O número $num é positivo!!")
    else
        println("O número $num é negativo!!")

    //Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    // Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
    println("\n>> F - Feminino ou M - Masculino <<")
    println("Digite o seu sexo (F ou M): ")
    val sexo = readLine()//Ou poderia usar o readLine()!!.first() que lê o primeiro caractere digitado
    if (sexo == "F" || sexo == "f")
        println("Seu sexo é feminino! O melhor rsrsrsrsrs")
    else if(sexo == "M" || sexo == "m")
        println("O seu sexo é o masculino. Sexo frágil :O")
    else
        println("Sexo inválido!")

    //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
    println("\n>> Vamos descobrir se a letra é Vogal ou Consoante <<")
    println("Digite a letra: ")
    val letra = readLine()!!.first()
    if(letra in "aeiouAEIOU")//poderia usar mais uma condição com o comendo letra.isLetter() para confirmar que é uma letra e não número
        println("A letra $letra que você digitou é: VOGAL.")
    else
        println("A letra $letra que você digitou é: CONSOANTE.")

    //Faça um programa para a leitura de duas notas parciais de um aluno.
    // O programa deve calcular a média alcançada por aluno e apresentar:
    //A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    //A mensagem "Reprovado", se a média for menor do que sete;
    //A mensagem "Aprovado com Distinção", se a média for igual a dez.
    println("\n>> Vamos descobrir a sua média <<")
    println("Digite a primeira nota: ")
    val nota1 = readLine()!!.toInt()
    println("Digite a segunda nota: ")
    val nota2 = readLine()!!.toInt()
    val media = (nota1 + nota2) / 2
    if (media >= 7)
        println("Parabéns! Você foi aprovado!")
    else if (media == 10)
        println("Você foi aprovado com distinção!")
    else
        println("REPROVADO!")

    //Faça um Programa que leia três números e mostre o maior deles.
    println("\n>> Vamos descobrir qual maior número Inteiro <<")
    println("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()
    println("Digite o terceiro número: ")
    val numero3 = readLine()!!.toInt()
    if (numero1 > numero2 && numero1 > numero3)
        println("O número $numero1 é maior que o número $numero2 e numero $numero3")
    else if (numero2 > numero1 && numero2 > numero3)
        println("O número $numero2 é maior que o número $numero1 e numero $numero3")
    else if (numero1 == numero2 && numero2 == numero3)
        println("O número $numero1 é igual aos números $numero2 e  $numero3")

    else
        println("O número $numero3 é maior que o número $numero1 e numero $numero2")
    //outra forma de resolver é utilizando a função maxOf

    //Faça um Programa que leia três números e mostre o maior e o menor deles.
    println("\n>> Vamos descobrir qual maior e menor número Inteiro <<")
    println("Digite o primeiro número: ")
    val numm1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val numm2 = readLine()!!.toInt()
    println("Digite o terceiro número: ")
    val numm3 = readLine()!!.toInt()
    val maior = maxOf(numm1, numm2, numm3)
    val menor = minOf(numm1, numm2, numm3)
    println(">> O maior valor entre $numm1, $numm2 e $numm3 é: $maior")
    println(">> O menor valor entre $numm1, $numm2 e $numm3 é: $menor")

    //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
    //sabendo que a decisão é sempre pelo mais barato.
    println("\n>> Vamos descobrir qual produto você deve comprar!! <<")
    println("Digite o preço do primeiro produto: ")
    val prodt1 = readLine()!!.toDouble()
    println("Digite o preço do segundo produto: ")
    val prodt2 = readLine()!!.toDouble()
    println("Digite o preço do terceiro produto: ")
    val prodt3 = readLine()!!.toDouble()
    val barato = minOf(prodt1, prodt2, prodt3)
    println("$prodt1, $prodt2, $prodt3! Entre os três produtos o mais barato é: $barato ! Você deveria levar ele!")

    //Faça um Programa que leia três números e mostre-os em ordem decrescente.
    println("\n>> Vamos mostrar os números em ordem decrescente!! <<")
    println("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val n2 = readLine()!!.toInt()
    println("Digite o terceiro número: ")
    val n3 = readLine()!!.toInt()

    val numeros = listOf(n1, n2, n3).sortedDescending()
    println("Os números em ordem decrescente são: $numeros")

    //10.Faça um Programa que pergunte em que turno você estuda.Peça para digitar M-matutino ou V-Vespertino ou
    // N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
    println(">> TURNO DE TRABALHO <<")
    println("\nM - Matutino \nV- Vespertino \nN- Noturno \nDigite em qual turno você trabalha: ")
    val opc = readLine()?.uppercase()

    when(opc){
        "M" -> println("Bom dia!")
        "V" -> println("Boa tarde!")
        "N" -> println("Boa noite!")
        else -> println("Valor inválido")
    }

    //As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para
    //desenvolver o programa que calculará os reajustes.
    //Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    //salários até R$ 280,00 (incluindo) : aumento de 20%
    //salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    //salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    //salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado
    //informe na tela: o salário antes do reajuste, o percentual de aumento aplicado, o valor do aumento, o novo salário,
    // após o aumento.
    fun main() {
        // Título do programa
        println("ORGANIZAÇÕES TABAJARA - AUMENTO SALARIAL")
        print(">> Digite seu salário atual: ")
        val salarioAtual = readLine()!!.toDouble()

        var percentual: Double = 0.0
        var valorAumento: Double = 0.0
        var novoSalario: Double = 0.0

        if (salarioAtual <= 280) {
            percentual = 20.0
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentual = 15.0
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentual = 10.0
        } else {
            percentual = 5.0
        }

        valorAumento = salarioAtual * (percentual / 100)
        novoSalario = salarioAtual + valorAumento

        println("\n>> INFORMAÇÕES DO REAJUSTE <<")
        println("- Salário antes do reajuste: R$ $salarioAtual")
        println("- Percentual de aumento aplicado: $percentual%")
        println("- Valor do aumento: R$ $valorAumento")
        println("- Novo salário após o reajuste: R$ $novoSalario")
    }
}

