//Desenvolva um programa em Java (utilizando a IDE Eclipse) que,dado um inteiro n passado como entrada, recebe n entradas de
//outros inteiros, e retorna a soma entre estas n entradas;

import java.util.Scanner;

public class Q2_LarissaEvangelista{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o valor de n: ");
			int n = sc.nextInt();
			int soma = 0;
			
			System.out.println("Digite os " + n + " números:");
			for (int i = 0; i < n; i++) {
			    int numero = sc.nextInt();
			    soma += numero;
			}

			System.out.println("A soma dos números é: " + soma);
		}
    }
}
