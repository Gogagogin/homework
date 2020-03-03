package by.gil;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[20];
        int maxElement = array[0];
        int minElement = 100;
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                number = i + 1;
            }
        }
        if (number == array.length || number == 1) {
            if (number == array.length) {
                System.out.println(" \nМаксимальное число последнее, и число перед ним равно " + array[number - 2]);
            }
            if (number == 1) {
                System.out.println(" \nМаксимальное число первое, и число после него равно " + array[number + 1]);
            }
        } else {
            System.out.println(" \nСумма чисел между максимальным числом " + array[number - 1] + " с индексом " + number + " равна :" + (array[number - 2] + array[number]));
        }
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
                number = i + 1;
            }
        }
        if (number == array.length || number == 1) {
            if (number == array.length) {
                System.out.println("Минимальное число последнее, и число перед ним равно " + array[number - 2]);
            }
            if (number == 1) {
                System.out.println("Минимальное число первое, и число после него равно " + array[number + 1]);
            }
        } else {
            System.out.println("Сумма чисел между минимальным числом " + array[number - 1] + " с индексом " + number + " равна :" + (array[number - 2] + array[number]));
        }
    }
}
