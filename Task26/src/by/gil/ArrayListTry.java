package by.gil;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колчисество оценок :");
        int element = in.nextInt();

        int negative = 3;
        ArrayList <Integer> mark = new ArrayList(element);

        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);

            mark.add(a);
        }
        System.out.println(mark);

        ArrayList<Integer> negativeList = new ArrayList();
        for (int i = 0; i < element; i++) {
            int k = mark.get(i);
            if (k <= negative) {
                negativeList.add(k);
            }
        }
        mark.removeAll(negativeList);
        System.out.println(mark);
    }
}
/* please gibe me advice
What is better to use in such situation ?
use Generic with ArrayList ?

Oro make int k = (int)mark.get(i);?
 */
