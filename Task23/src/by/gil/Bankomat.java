package by.gil;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {

        System.out.println(" Введите колчество купюр в банкомате: ");
        Scanner in20 = new Scanner(System.in);
        System.out.println("Количество купюр номиналом 20 :");
        int paper20 = in20.nextInt();
        Scanner in50 = new Scanner(System.in);
        System.out.println("Количество купюр номиналом 50 :");
        int paper50 = in50.nextInt();
        Scanner in100 = new Scanner(System.in);
        System.out.println("Количество купюр номиналом 100 :");
        int paper100 = in100.nextInt();

        Banknotes bankomat = new Banknotes(paper20, paper50, paper100);

        Scanner operation = new Scanner(System.in);


        while (true) {

            System.out.println("Выберите операцию: \n 1 - пополнение; \n 2 - снятие наличных; \n 3 - просмотр суммы в банкомате; \n 4 - выйти;");
            int numberOfOperation = operation.nextInt();
            if (numberOfOperation == 1) {
                while (true) {
                    Scanner operationReplenishment = new Scanner(System.in);
                    System.out.println("какую купюры вы хотите вставить в банкомат: \n 1 - 20; \n 2 - 50; \n 3 - 100; \n 4 - выход;");
                    int numberOfOperationReplenishment = operationReplenishment.nextInt();
                    if (numberOfOperationReplenishment == 1) {
                        Scanner replenishmentTwenty = new Scanner(System.in);
                        System.out.println("сколько купюр номиналом 20 вы вносите ?");
                        int inputNumberOfTwenty = replenishmentTwenty.nextInt();
                        bankomat.addTwenty(inputNumberOfTwenty);
                    } else if (numberOfOperationReplenishment == 2) {
                        Scanner replenishmentFifty = new Scanner(System.in);
                        System.out.println("сколько купюр номиналом 50 вы вносите ?");
                        int inputNumberOfFifty = replenishmentFifty.nextInt();
                        bankomat.addFifty(inputNumberOfFifty);
                    } else if (numberOfOperationReplenishment == 3) {
                        Scanner replenishmentFifty = new Scanner(System.in);
                        System.out.println("сколько купюр номиналом 100 вы вносите ?");
                        int inputNumberOfHundred = replenishmentFifty.nextInt();
                        bankomat.addHundred(inputNumberOfHundred);
                    } else if (numberOfOperationReplenishment == 4) {
                        break;
                    } else {
                        System.out.println("Error");
                    }
                }
            }
            else if (numberOfOperation == 2) {

                Scanner extraditionOfMoney = new Scanner(System.in);
                bankomat.getSum();
                System.out.println("Какую сумму вам выдать ?");
                int summa = extraditionOfMoney.nextInt();
                bankomat.extraditionOfMoney(summa);
                bankomat.getSum();
            }

            else if (numberOfOperation == 3) {
                bankomat.getSum();
            }

            else if (numberOfOperation == 4) {
                break;
            } else {
                System.out.println("Error, нет такой операции");
            }
        }
    }
}



