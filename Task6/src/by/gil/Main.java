package by.gil;

public class Main {

    public static void main(String[] args) {
        int d = 28, m = 2, y = 2020;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
            if (d == 31) {
                d = 1;
                m++;
            } else {
                d++;
            }
        } else if (m == 2) {
            if (y % 4 == 0) {
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
            if (d == 31) {
                d = 1;
                m = 1;
                y++;
            } else {
                d++;
            }

        } else {
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
