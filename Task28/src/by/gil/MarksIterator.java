package by.gil;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MarksIterator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колчисество оценок :");
        int element = in.nextInt();

        ArrayList<Integer> mark = new ArrayList(element);

        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);

            mark.add(a);
        }
        System.out.println(mark);

        int maxMark = 0;

        ListIterator<Integer> listIterator = mark.listIterator();

        while(listIterator.hasNext()){
            int realyMaxMark = listIterator.next();
            if (maxMark<=realyMaxMark){
                maxMark = realyMaxMark;
            }
        }
        System.out.println(maxMark);
    }
}

