package classString

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    var vogais = 0;
    var palavraInvertida = "";
    var contadorPalavra = 0;

    println("Escreva uma palavra");
    var palavra = scan.nextLine()

    println("Escreva um caracter de troca");
    val troca = scan.nextLine()

    println("Escreva um caracter counter");
    val contador = scan.nextLine()

    println("Escreva substring verificadora");
    val palavraVerificadora = scan.nextLine()

    for (i in palavra.length - 1 downTo 0) {
        palavraInvertida += palavra[i]
    }

    palavra.forEach { letra ->
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            vogais++;
        }
        if(letra == contador[0]){
            contadorPalavra++;
        }
    }

    if (palavra.contains(palavraVerificadora)) {
        println("A palavra contém a substring verificadora")
    } else {
        println("A palavra não contém a substring verificadora")
    }

    println("Palavra invertida: $palavraInvertida")
    println("Quantidade de vogais: $vogais")
    println("Quantidade de consoantes: ${palavra.length - vogais}")
    println("Palavra trocada: ${palavra.replace(troca, "e")}")
}