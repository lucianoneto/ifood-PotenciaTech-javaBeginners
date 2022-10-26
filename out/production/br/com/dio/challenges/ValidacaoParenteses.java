package out.production.br.com.dio.challenges;

/*
* Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida.
*
* Uma string é considerada válida se:
* Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida.
*
* A saída corresponde a um valor Booleano.
* */

import java.util.*;

public class ValidacaoParenteses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

    System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        float numeroPares = 0;

        if(s.length() == 1)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if(i != s.length() - 1){
                if(s.charAt(i) == '{' && s.charAt(i+1) == '}')
                    numeroPares ++;
                if (s.charAt(i) == '(' && s.charAt(i+1) == ')')
                    numeroPares ++;
                if (s.charAt(i) == '[' && s.charAt(i + 1) == ']')
                    numeroPares++;
            }
            }

        float metadeString = s.length();
        metadeString = metadeString/numeroPares;

        return metadeString == 2 || s.equals("()") || s.equals("{}") || s.equals("[]");
    }

}