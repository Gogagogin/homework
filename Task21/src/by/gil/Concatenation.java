package by.gil;

import java.util.Scanner;

public class Concatenation {

    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder();
        String str = "Мы будем складывать строки";
        strBuilder.append(str);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество конкатенаций :");
        int n = in.nextInt();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            String str1 = " это " + (i + 1) + " раз";
            str += str1;
        }
        long finish = System.nanoTime();
        System.out.println(str);
        long TimeOfStrConcatenation = finish - start;
        System.out.println("Время выполнение через фунцию += составило : " + TimeOfStrConcatenation + " наносекунд");

        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            strBuilder.append(" это " + (i + 1) + " раз");
        }
        finish = System.nanoTime();
        System.out.println(strBuilder);
        long TimeOfStrBuilder = finish - start;
        System.out.println("Время выполнение через append : " + TimeOfStrBuilder + " наносекунд");

        if (TimeOfStrBuilder < TimeOfStrConcatenation) {
            System.out.println("Через метод append быстрее на " + (TimeOfStrConcatenation - TimeOfStrBuilder) + " наносекунд");
        } else {
            System.out.println("Через += быстрее" + (TimeOfStrBuilder- TimeOfStrConcatenation) + " наносекунд");
        }
    }
}
