package out.production.br.com.dio.challenges;

/*
 * Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida.
 * Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.
 * Logo, NÃO é um Palíndromo.
 * Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.
 *
 * A entrada consiste em um palavra.
 *
 * Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.
 * */

import java.util.Objects;
import java.util.Scanner;

public class ChecagemPalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        StringBuilder novaPalavraString = new StringBuilder();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            char novaPalavra = palavra.charAt(i);
            novaPalavraString.append(novaPalavra);
        }

        if (Objects.equals(novaPalavraString.toString(), palavra))
            System.out.print("TRUE");
        else
            System.out.print("FALSE");
    }


}