fun main() {
    //Faça um Programa que mostre a mensagem "Alo mundo" na tela.
    println(">>> Hello,  World!")

    //Faça um Programa que peça um número e então mostre a mensagem: O número informado foi [número].
    println(">> Digite um número aqui: ")
    val numero = readLine()!!.toInt()
    println("O número digitado foi: $numero")

    //Faça um Programa que peça dois números e imprima a soma.
    println(">> Digite o primeiro número que quer somar: ")
    val num1 = readLine()!!.toInt()
    println("Agora digite o segundo número que quer somar: ")
    val num2 = readLine()!!.toInt()
    val soma = num1 + num2
    println(">>> A soma dos dois números é: $soma")

    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    println("\n>>> Vamos descobrir a sua média! <<<")
    println("Para descobrir, digite sua primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    println("Agora digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    println("Agora digite a tereira nota: ")
    val nota3 = readLine()!!.toDouble()
    println("Agora digite a quarta nota: ")
    val nota4 = readLine()!!.toDouble()
    val media = (nota1 + nota2 + nota3 + nota4) / 4
    println("A sua média é: $media")

    //Faça um Programa que converta metros para centímetros
    println("\n>> Vamos converter suas medidas de metros para centimetros!! <<")
    println("Digite sua medida em METROS: ")
    val metros = readLine()!!.toDouble()
    val centimetros = metros * 100
    println("O valor que você informou é: $centimetros cm")

    //Faça um Programa que peça o raio de um círculo, calcule e mostre a sua área.
    println("\n>>> Vamos descobrir a área do seu círculo <<<")
    println("Digite aqui o radio do seu círculo: ")
    val raio = readLine()!!.toDouble()
    val area = Math.PI * raio * raio
    println("A área do círculo é: $area")

    //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
    println("\n>>> Vamos calcular a área do seu quadrado <<<")
    println("Digite o valor da base: ")
    val base = readLine()!!.toDouble()
    println("Agora digite o valor da altura: ")
    val altura = readLine()!!.toDouble()
    val areaquadrado = base * altura
    val dobroarea = areaquadrado * 2
    println("O valor da área é $areaquadrado . E o dobro da área é $dobroarea")

    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    //Calcule e mostre o total do seu salário no referido mês.
    println("\n>> Vamos descobrir o seu salário de cada mês <<")
    println("Digite quanto você ganha por hora:")
    val ganhohora = readLine()!!.toDouble()
    println("Agora digite quantas horas você trabalha por mês:")
    val horastrabalho = readLine()!!.toDouble()
    val salario = ganhohora * horastrabalho
    println("O valor do seu salário deve ser: $salario")

    //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    println("\n>> Vamos descobrir sua temperatura em Celsius <<")
    println("Digite sua temperatura atual em Fahrenheit:")
    val tempf = readLine()!!.toDouble()
    val celsius = 5 * ((tempf-32) / 9)
    println("A sua temperatura em Celsius é: $celsius")

    //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    println("\n>> Vamos descobrir sua temperatura em Fahrenheit <<")
    println("Digite sua temperatura atual em Celsius:")
    val tempC = readLine()!!.toDouble()
    val fahrenheit = (tempC * 9 / 5) + 32
    println("A sua temperatura em Celsius é: $fahrenheit")

    //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    //O produto do dobro do primeiro com metade do segundo.
    //A soma do triplo do primeiro com o terceiro.
    //O terceiro elevado ao cubo.
    println("\n>> Vamos calcular!! <<")
    print("Digite o primeiro número inteiro: ")
    val numInt1 = readLine()!!.toInt()
    print("Digite o segundo número inteiro: ")
    val numInt2 = readLine()!!.toInt()
    print("Digite um número real: ")
    val numReal = readLine()!!.toDouble()

    val produto = (numInt1 * 2) * (numInt2/ 2)
    val somaa = (numInt1 * 3) + numReal
    val cubo = numReal * numReal * numReal

    println("O produto do dobro do primeiro com metade do segundo é: $produto")
    println("A soma do triplo do primeiro com o terceiro é: $somaa")
    println("O terceiro número elevado ao cubo é: $cubo")
    println("E ISSO É TUDOOO!!")

}


