package by.gil;

public class Main {

    public static void main(String[] args) {
	byte b1 = 1;
	short s1 = b1;
	int i1 = b1;
	long l1 = i1;
        System.out.println(b1 + " " + s1 + " " + i1 + " " +l1);
    float f1 = l1;
    double d1 = f1;
        System.out.println(f1 + " " + d1);
    long l2 = 2;
    int i2 = (int) l2;
    short s2 = (short) i2;
    byte b2 = (byte) s2;
        System.out.println(b2 + " " + s2 + " " + i2 + " " +l2);
    }
}
