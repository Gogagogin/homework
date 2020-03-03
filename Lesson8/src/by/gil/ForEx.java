package by.gil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEx {

    public static void main(String[] args) {
        int i =1;
	// write your code here
        returnFoFor(9);
        returnFoFor(10);
        returnFoFor(11);
    }
    static void returnFoFor (int count) {
        for (int i = 0; i<count;i++) {
            if (i == 10) return;

        }
        System.out.println("Count = " + count );

        //Arrays.sort(ints);
    }
}
