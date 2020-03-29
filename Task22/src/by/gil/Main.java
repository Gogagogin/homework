package by.gil;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Вы хотите ввести 1 или 3 параметра ?:");
        int n = in.nextInt();
        if (n == 1) {
            Scanner inSeconds = new Scanner(System.in);
            System.out.println("Введите количество секунд:");
            int seconds = in.nextInt();
            Interval interval = new Interval(seconds);
        } else if (n == 3) {
            Scanner inHours = new Scanner(System.in);
            System.out.println("Введите количество часов:");
            int hours = in.nextInt();
            Scanner inMinutes = new Scanner(System.in);
            System.out.println("Введите количество минут:");
            int minutes = in.nextInt();
            Scanner inSeconds = new Scanner(System.in);
            System.out.println("Введите количество часов:");
            int seconds = in.nextInt();
            Interval interval1 = new Interval(hours,minutes,seconds);
        }

        Interval interval = new Interval(1,1,1);
        Interval interval1 = new Interval(100);

        System.out.println(interval.compareTo(interval1));

    }
}
