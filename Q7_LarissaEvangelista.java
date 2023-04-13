/***Desenvolva um programa em Java (utilizando a IDE Eclipse) que,dada uma lista de números inteiros armazenados em um arquivo
retorna a soma entre estes números;***/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7_LarissaEvangelista {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/laris/OneDrive/Documentos/numerosinteiros.txt";
        /*** Segue os números caso queira somar:
        69 + 81 + 92 = 242
		9 + 27 + 8 = 44
		23 + 53 + 52 = 128
		91 + 5 + 45 = 141
		Total: 555
		^-^
		***/
        
        int soma = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line);
                soma += num;
            }
        }
        
        System.out.println("Soma dos números inteiros no arquivo: " + soma);
    }
}
