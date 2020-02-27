package by.gil;

public class Main {

    public static void main(String[] args) {
        String a = "Число простое";

        int number = 491;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                a = "Число не простое, а имеет как минимум делитель :" + i;
                break;
            }
        }

        System.out.println(a);
    }
}
