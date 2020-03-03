package by.gil;

public class AutoBOxingExample {
    public static void main(String[] args) {
        boolean b = true;
        Boolean bObj = false;
        System.out.println(b + " " + bObj);

        byte b1 = 1;
        Byte b1Obj = 1;
        System.out.println(b1 + " " + b1Obj);

        char c = 'c';
        Character cObj = 'c';
        System.out.println(c + " " + cObj);

        int i = -1;
        Integer iObj = -1;
        iObj = 100;
        i = iObj;
        System.out.println(i + " " + iObj);
        printSmth(iObj);
        printSmth(b1Obj);
    }

    static void printSmth (int i) {
        System.out.println(i);
    }
}
