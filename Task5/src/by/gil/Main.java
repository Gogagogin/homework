package by.gil;

public class Main {

    public static void main(String[] args) {
        String rub = null;
        for (int i = 1; i <= 10; i++) {
            int s = (int) (Math.random() * 1000000);
            if (s % 10 == 1) {
                rub = " рубль";
            } else if (s % 10 > 1 && s % 10 < 4) {
                rub = " рубля";
            } else if ((s % 10 > 4 && s % 10 <= 9) || (s % 100 > 10 && s % 100 < 21) || s % 10 == 0) {
                rub = " рублей";
            }
            System.out.println(s + rub);
        }
    }
}
