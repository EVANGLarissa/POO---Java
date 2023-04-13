/***Desenvolva um programa em Java (utilizando a IDE Eclipse) que,dada uma String, retorna os tokens desta String que começam
com a letra “s”;***/

import java.util.StringTokenizer;

public class Q4_LarissaEvangelista {
    public static void main(String[] args) {
        String input = "Esta é uma string de exemplo com alguns tokens que começam com a letra s";
        String delimiters = " \t\n\r\f,.:;?![]{}()";
        StringTokenizer tokenizer = new StringTokenizer(input, delimiters);
        
        System.out.println("Tokens que começam com a letra 's':");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
                System.out.println(token);
            }
        }
}
