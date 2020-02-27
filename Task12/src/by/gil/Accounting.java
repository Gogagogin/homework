package by.gil;

public class Accounting {

    public static void main(String[] args) {
        long number = 3548461354784L;
        int i = 0;
        long number2 = number;
        while (number != 0) {
            number = number / 10;
            i++;
        }
        int d = i % 3;
        int a = (int) (number2 / Math.pow(10, i - d));
        System.out.print(a + " ");
        while (i > 2) {
            int b = (int) Math.pow(10, i - d - 3);
            System.out.print(number2 / b % 1000 + " ");
            i -= 3;
        }
        System.out.println("\n" + number2);
    }
}
