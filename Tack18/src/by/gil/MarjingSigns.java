package by.gil;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarjingSigns {
    public static void main(String[] args) {
        //first way of solving
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку :");
        String str = in.nextLine();
        //  System.out.println(str.replaceAll( "[\\W[\\S]]", "").length());
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        char symbol;
        int exMark = 0, point = 0, comma = 0, semicolon = 0, colon = 0, qMark = 0, dash = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println( "Количество знанков припенания равно :" + count);

        //second way of solving

        for ( int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '!'){
               exMark++;
            } else if (symbol == '.'){
                point++;
            }  else if (symbol == ','){
                comma++;
            } else if (symbol == ';'){
                semicolon++;
            } else if (symbol == ':'){
                colon++;
            } else if (symbol == '?'){
                qMark++;
            } else if (symbol == '-'){
                dash++;
            }

        }
        System.out.println("В данной строке приуствуют запятиые, в количестве :" + comma +"\n"
                            + "точки, в количестве " + point +"\n"
                            + "восклицательные знаки, в количестве " + exMark +"\n"
                            + "точки с заятой, в количестве " + semicolon +"\n"
                            + "двоеточия, в количестве " + colon +"\n"
                            + "знаки вопроса, в количестве " + qMark +"\n"
                            + "тире, в количестве " + qMark +"\n"
                            + "всего знаков припенания в строке : " + (comma + point + exMark + semicolon + colon + qMark+ dash));
    }
}

