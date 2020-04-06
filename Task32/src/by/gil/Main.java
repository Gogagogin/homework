package by.gil;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

       PrintToFile printToFile = new PrintToFile();
        try {
            printToFile.printToFile();
        } catch (IOException e) {
            System.out.println("Error");
        }
        ReadTheFile readTheFile = new ReadTheFile();
        try {
            readTheFile.reader();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }


}
