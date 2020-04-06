package by.gil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadTheFile {



    public void reader() throws IOException {

        byte[] bytes = null;
        double sum = 0;
        int bytesCount = 0;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(
                    (new FileInputStream("write_numbers.dat"))));

            bytes = new byte[dataInputStream.available()];
            bytesCount = dataInputStream.read(bytes);
            System.out.println(Arrays.toString(bytes));
            System.out.println("Количество элементов: " + bytesCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        for (byte b:bytes) {
            sum += b;
        }

        System.out.println(sum/bytesCount);
        if(dataInputStream!=null){
            dataInputStream.close();
        }

    }
}
