package by.gil;

import java.io.*;

public class ReadAndCount extends Counter {

    StringBuilder stringBuilder = new StringBuilder();


    public void readTheFile(String fileName) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String res = bufferedReader.readLine();
            while (res != null) {
               stringBuilder.append(res);
                /*countPunctuation(res);
                countWords(res);*/
                res = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
        countPunctuation(stringBuilder.toString());
                countWords(stringBuilder.toString());
    }
}



