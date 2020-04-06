package by.gil;

import java.io.*;

public class PrintToFile {

    public void printToFile() throws IOException {

        DataOutputStream a = null;

        {
            try {
                a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("write_numbers.dat")));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 20; i++) {
                try {
                    a.write((int) ((Math.random()*100) +1));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
            a.close();
    }
}
