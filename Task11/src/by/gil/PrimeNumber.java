package by.gil;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 491;
        boolean b = false;
        int c = 1;
        String a = "Число простое";
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                b = true;
                if (c == 1) {
                    a = "Число не простое, а имеет как минимум делители :";
                    System.out.print(a + i + " ");
                    c++;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        if (c == 1) {
            System.out.println(a);
        }
    }
}