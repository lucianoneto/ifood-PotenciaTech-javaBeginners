package out.production.br.com.dio.challenges;

/*
* Nesse desafio, dados dois números, verifique se eles são iguais.
* Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas.

* As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros.
*
* A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.
* */

import java.util.Scanner;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        if(numeroA == numeroB)
            System.out.print("Sao iguais!");
        else
            System.out.print("Nao sao iguais!");

    }
}