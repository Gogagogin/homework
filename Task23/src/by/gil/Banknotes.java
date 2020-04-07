package by.gil;

public class Banknotes {

    private int numberOfTwenty;
    private int numberOfFifty;
    private int numberOfHundred;

    public Banknotes(int numberOfTwenty, int numberOfFifty, int numberOfHundred) {
        this.numberOfTwenty = numberOfTwenty;
        this.numberOfFifty = numberOfFifty;
        this.numberOfHundred = numberOfHundred;
    }

    public int addTwenty(int inputNumberOfTwenty) {
        this.numberOfTwenty += inputNumberOfTwenty;
        return this.numberOfTwenty;
    }

    public int addFifty(int inputNumberOfFifty) {
        this.numberOfFifty += inputNumberOfFifty;
        return this.numberOfFifty;
    }

    public int addHundred(int inputNumberOfHundred) {

        return this.numberOfHundred + inputNumberOfHundred;
    }
/*
    public int getNumberOfTwenty()
    {
        return numberOfTwenty;
    }

    public int getNumberOfFifty() {

        return numberOfFifty;
    }

    public int getNumberOfHundred()
    {
        return numberOfHundred;
    }*/


    public void getSum() {
        int minNote = 20;

        if (numberOfTwenty ==0) {
            if(numberOfFifty!= 0) {
                minNote = 50;
            } else {
                minNote = 100;
            }
        }

        System.out.println("В банкомате сейчас " + ((numberOfHundred * 100) + (numberOfFifty * 50) + (numberOfTwenty * 20)) + " Минимальная купюра " + minNote);
    }


    public boolean extraditionOfMoney(int requestedSum) {

        if (requestedSum > (numberOfFifty * 50 + numberOfHundred * 100 + numberOfTwenty * 20)) {
            System.out.println(" У меня нет столько денег, простите пожалуйста");
            return false;
        }
        if (requestedSum % 10 != 0 || requestedSum == 30 || requestedSum == 10) {
            System.out.println(" Я не могу выдать такую сумму, простите");
            return false;
        }

        int uotPutNumberOfHundred = requestedSum / 100;
        if (this.numberOfHundred < uotPutNumberOfHundred) {
            uotPutNumberOfHundred = this.numberOfHundred;
        }
        int uotPutNumberOfFifty = (requestedSum - 100 * uotPutNumberOfHundred) / 50;
        if (this.numberOfFifty < uotPutNumberOfFifty) {
            uotPutNumberOfFifty = this.numberOfFifty;
        }
        int uotPutNumberOfTwenty = (requestedSum - 100 * uotPutNumberOfHundred - 50 * uotPutNumberOfFifty) / 20;
        if (this.numberOfTwenty < uotPutNumberOfTwenty) {
            uotPutNumberOfTwenty = this.numberOfTwenty;
        }
        if (this.numberOfHundred == 0 && this.numberOfFifty == 0 && requestedSum % 20 != 0) {

            System.out.println("Я не могу выдать такую сумму, простите");
            return false;

        } else {
            if (uotPutNumberOfHundred == 0 && uotPutNumberOfFifty == 0 && uotPutNumberOfTwenty == 0) {
                System.out.println("Извените, не могу выдать такую сумму");
            } else {
                System.out.println(uotPutNumberOfHundred + " Х 100 " +
                        uotPutNumberOfFifty + " Х 50 " +
                        uotPutNumberOfTwenty + " Х 20 ");
                this.numberOfTwenty -= uotPutNumberOfTwenty;
                this.numberOfFifty -= uotPutNumberOfFifty;
                this.numberOfHundred -= uotPutNumberOfHundred;
            }


            return true;
        }
    }
}
