import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день :");
        int d = in.nextInt();
        System.out.println("Введите месяц :");
        int m = in.nextInt();
        System.out.println("Введите год :");
        int y = in.nextInt();


        if (m > 12){
            System.out.println("Такого месяца нет");
            System.exit(0);
        }
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
            if (d > 31) {
                System.out.println("Такого дня не может быть");
                System.exit(0);
            }
            if (d == 31) {
                d = 1;
                m++;
            } else {
                d++;
            }
        } else if (m == 2) {
            if (y % 4 == 0) {
                if (d > 29) {
                    System.out.println("Такого дня не может быть");
                    System.exit(0);
                }
                if (d == 29) {
                    d = 1;
                    m = 3;
                } else {
                    d++;
                }
            } else if (d == 28) {
                d = 1;
                m = 3;
            }

        } else if (m == 12) {
            if (d > 31){
                System.out.println("Такого дня не может быть");
                System.exit(0);
            }
            if (d == 31) {
                d = 1;
                m = 1;
                y++;
            } else {
                d++;
            }

        } else {
            if (d > 30){
                System.out.println("Такого дня не может быть");
                System.exit(0);
            }
            if (d == 30) {
                d = 1;
                m++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + m + " " + y);
    }
}


