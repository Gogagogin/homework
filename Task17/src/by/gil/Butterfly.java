package by.gil;

import java.util.Arrays;
import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {
        Scanner inV = new Scanner(System.in);
        System.out.println("Введите длину массива :");
        String arrayLengthV = inV.nextLine();
        int i = Integer.parseInt(arrayLengthV);
        Scanner inH = new Scanner(System.in);
        System.out.println("Введите ширину массива :");
        String arrayLengthH = inH.nextLine();
        int j = Integer.parseInt(arrayLengthH);
        if (j > i) {
            int a = j;
            j = i;
            i = a;
        }
            int a = j;
            int sdvig = Math.round((i - j) / 2);
            int bf[][] = new int[j][i];
            for (i = 0; i < a; i++) {
                if (Math.round(a / 2) > i) {
                    for (j = i * sdvig; j < bf[i].length - i * sdvig; j++) {
                        bf[i][j] = 1;
                        // System.out.print(bf[i][j] + "\t");
                    }
                    System.out.println(Arrays.toString(bf[i]));
                } else {
                    System.out.println(Arrays.toString(bf[a - i - 1]));
                }
                //System.out.println(Arrays.toString(bf[a-(j+1)]));
            }
            System.out.println("");

        }
}
