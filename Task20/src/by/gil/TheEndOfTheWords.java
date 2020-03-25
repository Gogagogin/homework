package by.gil;

import java.util.Scanner;

public class TheEndOfTheWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку :");
        String sentence = in.nextLine();
        sentence = sentence.trim();
        //System.out.println(sentence);
        sentence = sentence.replaceAll("[!.,:;-]", "");

        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for(String word : words) {
            newSentence.append(word.charAt(word.length()-1));
        }
        System.out.println(newSentence);
    }
}
