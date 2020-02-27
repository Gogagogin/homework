package by.gil;

public class Main {

    public static void main(String[] args) {
	int s = (int)(Math.random()*100);
	if (s%10 == 7) {
        System.out.println(s + " Оканчивается на 7");
    } else {
        System.out.println(s + " Не Оканчивается на 7");
    }

    }
}
