import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> files = new ArrayList<>();
        ArrayList<String> folders = new ArrayList<>();

        File[] names = new File("C:\\Users\\Public").listFiles();
       //System.out.println(Arrays.toString(names));
        ArrayList<String> listOfNames = new ArrayList<String>();
        for (File i : names
        ) {
            if (i.isDirectory()) {
                folders.add(i.getName());
            }else {
                files.add(i.getName());
            }
        }

        System.out.println();

        System.out.println(folders);
        System.out.println(files);

    }
}
