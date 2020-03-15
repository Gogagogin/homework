package by.gil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TurnOver {

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
        for (i = 0; i < marks.length; i++){
            marks[i] = (int)(Math.random()*b+1);
            System.out.print(marks[i] + ", ");
        }
        System.out.println("");
        //System.out.println(Arrays.toString(marks));
        // first way
        for( i = marks.length-1; i != -1; i--){
            System.out.print(marks[i] + ", ");
        }
        // second way
        System.out.println("");
        i = 0;
        System.out.println(Arrays.toString(marks));
        for( int newIndex = marks.length-1; newIndex != marks.length/2-1; newIndex--){
            int intermediateValue = marks[newIndex];
            marks[newIndex] = marks[i];
            marks [i] = intermediateValue;
            i++;
        }
        System.out.println(Arrays.toString(marks));
    }
}

