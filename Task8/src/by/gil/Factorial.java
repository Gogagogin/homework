package by.gil;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {

       /* BigInteger fact = BigInteger.valueOf(1);
        int i = 1;
        while (i <=200) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
        Memory ERROR :(
        */
       double sum = 1;
       int i = 1;
       while (i <= 40) { // hear we can change value of factorial
           sum *=i;
           i++;
       }
        System.out.println(sum);
    }
}
