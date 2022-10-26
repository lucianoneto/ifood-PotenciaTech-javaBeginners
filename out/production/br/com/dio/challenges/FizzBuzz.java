package out.production.br.com.dio.challenges;

/*
* Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".
*
* Você receberá um número onde:
* Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
* Se o número for apenas múltiplo de 3 -> "Fizz" ;
* Se o número for apenas múltiplo de 5 -> "Buzz";
* Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
*
* Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número.
* */

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        if(num % 3 == 0)
            System.out.print("Fizz");
        if(num % 5 == 0 )
            System.out.print("Buzz");
        if(num % 3 != 0 && num % 5 != 0)
            System.out.print(num);

    }
}