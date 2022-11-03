package out.production.br.com.dio.challenges;

/*
 * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
 *
 * A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
 *
 * A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 *  */

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int multiplos, limite;
        int somaMultiplos = 0;

        Scanner input = new Scanner(System.in);
        multiplos = input.nextInt();
        limite = input.nextInt();

        for (int i = 2; i <= limite; i++) {
            if (i % multiplos == 0)
                somaMultiplos += i;
        }

        System.out.print(somaMultiplos);
    }
}
