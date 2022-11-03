package out.production.br.com.dio.challenges;

/*
 * Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0
 *
 * A Entrada será composta por um número inteiro, N.
 *
 * Será  impresso o somatório de N até 0.
 * */

import java.util.Scanner;

public class ChamadaRecursiva {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print(somatorio(numero.nextInt()));
    }

    /**
     * Método que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}