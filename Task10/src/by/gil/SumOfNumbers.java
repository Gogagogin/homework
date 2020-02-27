package by.gil;

public class SumOfNumbers {

    public static void main(String[] args) {
        int nubmer = -111_111;
        int sum = 0;
        do {
            int a = nubmer % 10;
            sum += a;
            nubmer /= 10;
        } while (nubmer != 0);// now it works with positive and negative
        System.out.println(sum);
    }
}
