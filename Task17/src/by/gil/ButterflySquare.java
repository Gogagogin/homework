package by.gil;

import java.util.Scanner;

public class ButterflySquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива :");
        String arrayLength = in.nextLine();
        int i = Integer.parseInt(arrayLength);
        int a = i;
        int j = i;
        int bf[][] = new int[i][j];
        for (i = 0; i < bf.length; i++) {
            if (Math.round(a / 2) > i) {
                for (j = i; j < bf[i].length - i; j++) {
                    bf[i][j] = 1;
                    // System.out.print(bf[i][j] + "\t");
                }
            } else {
                for (j = i; j >= bf[i].length-i-1; j--) {
                    bf[i][j] = 1;
                    // System.out.print(bf[i][j] + "\t");
                }
            }
            for (j = 0; j < bf[i].length; j++) {
                System.out.print(bf[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
