package out.production.br.com.dio.challenges;

/*
 * Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
 * Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo.
 * Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.
 *
 * A entrada consiste em um número inteiro n, representando o valor total.
 *
 * A saída consiste em retornar o menor número de números quadrados perfeitos.
 * */

import java.util.Scanner;

public class QuadradoPerfeito {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int aux;
        int quadrados = 0;
        int[] quadradosPerfeitos = new int[n];
        int j = 0;

        for (int i = 1; i <= n; i++) {
            aux = i * i;
            if (aux <= n) {
                quadradosPerfeitos[j] = aux;
                j++;
            }
        }

        for (int quadradosPerfeitosAux : quadradosPerfeitos) {
            for (j = 0; j < quadradosPerfeitos.length; j++) {
                if ((quadradosPerfeitosAux + quadradosPerfeitos[j]) == n)
                    quadrados++;
            }
        }

        for (int quadradosPerfeitoAux : quadradosPerfeitos) {
            for (j = 1; j < n; j++) {
                if ((quadradosPerfeitoAux * j) == n)
                    quadrados += j;
            }
        }
        System.out.print(quadrados);

    }
}