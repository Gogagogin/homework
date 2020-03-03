package by.gil;

import java.util.Random;

public class Main {


        public static void main(String[] args) {
            int [][] array = new int [5][4] ;
            //int [][] = {{2,1}; {3,4}};
            Random random = new Random();

            for (int i = 0 ; i < array.length; i++){
                for( int j = 0 ; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(100);
                    System.out.print("[" + i + "][" + j + "]="  + array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
