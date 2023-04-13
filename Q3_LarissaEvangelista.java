//Desenvolva um programa em Java (utilizando a IDE Eclipse) que,dada uma quantidade n de números passada como entrada e os
//próprios números, calcule a soma de todos os números.

import java.util.Scanner;

public class Q3_LarissaEvangelista {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite a quantidade de números a serem somados: ");
			int n = sc.nextInt();
			int soma = 0;
      
			
			System.out.println("Digite os " + n + " números");
			for (int i = 0; i < n; i++) {
			    int numero = sc.nextInt();
			    soma += numero;
			}

			System.out.println("A soma dos números será " + soma);
		}
    }
}
