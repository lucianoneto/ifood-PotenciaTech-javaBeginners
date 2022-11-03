package out.production.br.com.dio.challenges;

/*
 * Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.
 * Retorne um array que satisfaça essa condição.
 *
 * A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.
 *
 * A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares.
 * */

import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int tamanhoArray = input.nextInt();
        int[] numerosArray = new int[tamanhoArray];
        int numsAux;

        for (i = 0; i < tamanhoArray; i++) {
            numerosArray[i] = input.nextInt();
        }

        for (i = 0; i < tamanhoArray; i++) {
            for (int j = 0; j < tamanhoArray; j++) {
                if (numerosArray[i] % 2 == 0 && numerosArray[j] % 2 != 0) {
                    numsAux = numerosArray[i];
                    numerosArray[i] = numerosArray[j];
                    numerosArray[j] = numsAux;
                    break;
                }
            }
        }

        for (i = 0; i < tamanhoArray; i++) {
            System.out.println(numerosArray[i]);
        }
    }
}
