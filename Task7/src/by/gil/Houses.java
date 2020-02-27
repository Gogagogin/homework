package by.gil;

public class Houses {

    public static void main(String[] args) {
        int a = 6, b = 8, c = 12, d = 13, e = 15, f = 40;
        if ((e < a) || (e < b) || (e < c) || (e < d) || (f < a) || (f < b) || (f < c) || (f < d)) {
            System.out.println("Нельзя");
            System.exit(0);
        } else if ((a + c <= e) && (d <= f)) {
            System.out.println("Можно где а и с на одной оси е по оси Х");
        } else if ((a + d <= e) && (c <= f)) {
            System.out.println("Можно где а и d на одной оси е по оси Х");
        } else if ((b + c <= e) && (d <= f)) {
            System.out.println("Можно где b и с на одной оси е по оси Х");
        } else if ((b + d <= e) && (c <= f)) {
            System.out.println("Можно где b и d на одной оси е по оси Х");
        } else if ((a + c <= f) && (d <= e)) {
            System.out.println("Можно где а и с на одной оси f по оси Х");
        } else if ((a + d <= f) && (c <= e)) {
            System.out.println("Можно где а и d на одной оси f по оси Х");
        } else if ((b + c <= f) && (d <= e)) {
            System.out.println("Можно где b и с на одной оси f по оси Х");
        } else if ((b + d <= f) && (c <= e)) {
            System.out.println("Можно где b и d на одной оси f по оси Х");
        } else {
            System.out.println("Нельзя");
        }
    }
}
