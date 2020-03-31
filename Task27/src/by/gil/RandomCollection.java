package by.gil;

import java.util.*;

public class RandomCollection {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите колчисество элементов :");
        int element = in.nextInt();

        System.out.println("Введите максимально возможное значение элемента :");
        int maxElement = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList(element);
        ArrayList<Integer> numbers1 = new ArrayList(element);

        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * maxElement + 1);

            numbers.add(a);
        }

        numbers1.addAll(numbers);
        System.out.println(numbers);
        System.out.println("Если элемент повторяется, удалить оба элемента, или оставить первый элемент ?" + "\n 1- да" + "\n 2- нет");
        int theChoice = in.nextInt();


        for (int i = 0; i < numbers.size(); i++) {
            int a = 0;
            int k = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                int k1 = numbers.get(j);
                if (k1 == k) {
                    a++;
                    numbers.remove(j);
                    j--;
                }
            }
            if (theChoice == 1) {
                if (a >= 1) {
                    numbers.remove(i);
                    i--;
                }
            }
        }
        System.out.println(numbers);

        if (theChoice == 2) {

            System.out.println( "реализуем метод через Set, плюс он как раз отсортирует =)");
            Set<Integer> set = new HashSet<>(numbers1);
            numbers1.clear();
            numbers1.addAll(set);
            System.out.println(numbers1);
        }

    }
}
