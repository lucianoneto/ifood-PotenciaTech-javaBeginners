package out.production.br.com.dio.challenges;

/*
* O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n.
* Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação por uma rotação fixa
* de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.
* Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
* Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas.
* Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado de n.
*
* A entrada consiste em um valor inteiro positivo N.
*
* A saída consiste em retornar o valor do seu fatorial desajeitado de N.
*  */

import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println(fatorialDesajeitado(n));
    }

    public static int fatorialDesajeitado(int n) {
        if (n <= 2) {
            return n;
        } else if (n <= 4) {
            return n + 3;
        } else if (n % 4 == 0) {
            return n + 1;
        } else if (n % 4 == 3) {
            return n - 1;
        }
        return n + 2;
    }

}

