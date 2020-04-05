package by.gil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counter {

    public void countPunctuation(String str) {
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        System.out.println("Количество знанков припенания равно :" + count);

    }

    public void countWords(String str) {
        str = str.replaceAll("[,.!?]|[+]|[\n]|[\t]|[\r]" , "");
        str = str.replaceAll("[-]" , " ");
        int blockCount = str.split(" +").length;
        if (str.charAt(0) == ' '){
            blockCount--;
        }
        System.out.println("Количество слов равно " + blockCount);
    }
}
