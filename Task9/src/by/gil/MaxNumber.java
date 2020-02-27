package by.gil;

public class MaxNumber {

    public static void main(String[] args) {
        int a = 1;
        int i = 1;
        int x = (int) (Math.random() * 50);
        while (i < 20) {
            if (a < x) {
                System.out.print(" X= " + x + " =X "); // " X= " + x + " =X " is not really necessary,
                                                                // but it’s help us to see the process
                                                                // and ofcorse, i now about array search
                                                                //but this task is before arrays
                a = x;
            } else {
                x = (int) (Math.random() * 20);
                System.out.print(x + " ");
            }
            i++;
        }
        System.out.println("\n Максимальное :" + a);
    }
}
