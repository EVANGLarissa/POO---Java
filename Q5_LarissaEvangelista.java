/***Desenvolva um programa em Java (utilizando a IDE Eclipse) que,dado um arquivo de texto (txt), retorna uma lista de Strings com as
palavras que possuem a subsequência “link” no texto;***/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q5_LarissaEvangelista {

    public static void main(String[] args) {
        String filePath = "C:/Users/laris/OneDrive/Documentos/1.txt";
        List<String> wordsWithLink = findWordsWithLink(filePath);
        System.out.println("Palavras com a subsequência 'link': ");
        for (String word : wordsWithLink) {
            System.out.println(word);
        }
        System.out.println("Total de palavras com a subsequência 'link': " + wordsWithLink.size());
    }

    public static List<String> findWordsWithLink(String filePath) {
        List<String> wordsWithLink = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.toLowerCase().contains("link")) {
                        wordsWithLink.add(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsWithLink;
    }
}