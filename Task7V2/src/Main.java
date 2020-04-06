public class Main {

    public static void main(String[] args) {
        int a = 1, b = 3, c = 3, d = 1, e = 2, f = 3;

         if ((a + c <= e) && (d <= f)) {
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


