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
        int A, N;
        int somaMultiplos = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for(int i = 2; i<=N; i++){
            if(i%A==0)
                somaMultiplos += i;
        }

        System.out.print(somaMultiplos);
    }
}
