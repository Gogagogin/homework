package by.gil;

import java.util.Arrays;
import java.util.Scanner;

public class SumMinMax {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива :");
        String arrayLength = in.nextLine();
        int a = Integer.parseInt(arrayLength);

        System.out.println("Введите максимально допусимое значение :");
        String maxValue = in.nextLine();
        int b = Integer.parseInt(maxValue);

        int i = 0;
        int[] marks = new int[a];
        int indexOfMax = 0, indexOfMin = 0;
        int sum = 0;
        int maxMarks = 0, minMarks = b + 1; // maybe it's not very correct names of values
        for (i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * b + 1);
        }

        String intMarksStr = Arrays.toString(marks);
        System.out.println(intMarksStr);

        for (i = 0; i < marks.length; i++) {

            if (maxMarks < marks[i]) {
                indexOfMax = i;
                maxMarks = marks[i];
            }
            if (minMarks > marks[i]) {
                indexOfMin = i;
                minMarks = marks[i];
            }
        }
        if (indexOfMax < indexOfMin) {
            int c = indexOfMax;
            indexOfMax = indexOfMin;
            indexOfMin = c;
        }
        if (indexOfMin + 1 == indexOfMax) {
            System.out.println("Между максимальным и минимальным нет значений");
            System.exit(0);
        }

        for (i = indexOfMin+1; i < indexOfMax; i++) {
            sum += marks[i];
        }
        System.out.println(sum);











        /*if (indexOfMin == 0) {
            System.out.println("Минимальное число первое, и число после него равно : " + marks[1]);
        } else if (indexOfMin == marks.length - 1) {
            System.out.println("Минимальное число последнее, и число перед ним равно : " + marks[indexOfMin - 1]);
        } else {
            sumMin = marks[indexOfMin - 1] + marks[indexOfMin + 1];
            System.out.println("Минимальное число имеет индекс " + (indexOfMin + 1) + " и сумма чисел между равна " + sumMin);
        }
        if (indexOfMax == 0) {
            System.out.println("Максимальное число первое, и число после него равно : " + marks[1]);
        } else if (indexOfMax == marks.length - 1) {
            System.out.println("Максимальное число последнее, и число перед ним равно : " + marks[indexOfMax - 1]);
        } else {
            sumMax = marks[indexOfMax - 1] + marks[indexOfMax + 1];
            System.out.println("Максимальное число имеет индекс " + (indexOfMax + 1) + " и сумма чисел между равна " + sumMax);
        }*/
    }
}
