package by.gil;

import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку :");
        String str = in.nextLine();
        str = str.replaceAll("[,.!?]|[.+]" , "");
        str = str.replaceAll("[-]" , " ");
        int blockCount = str.split(" +").length;
        if (str.charAt(0) == ' '){
            blockCount--;
        }
        System.out.println("Количество слов равно " + blockCount);
    }

}
