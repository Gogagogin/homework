import java.util.*;

public class FrequencyDictionary  {
    public static void main(String[] args) {

        HashMap <String, Integer> wordAndNumber = new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку :");
        String str = in.nextLine();
        str = str.replaceAll("[,.!?]|[.+]" , "");
        str = str.replaceAll("[-]" , " ");
        String[] arrayStr = str.split(" +");


        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrayStr));

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i ++){
            int a = 1;
            String s = arrayList.get(i);
            for( int j  = i + 1; j <arrayList.size(); j ++ ){
                String s1 = arrayList.get(j);
                if (s.equalsIgnoreCase(s1)){
                    a++;
                    arrayList.remove(j);
                    j--;
                }
            }
            //System.out.println(s + " встречается " + a + " раз ");
            wordAndNumber.put(s.toLowerCase(),a);

        }

        TreeMap<String, Integer> sorted = new TreeMap<>(wordAndNumber);
        System.out.println(wordAndNumber);
        System.out.println(sorted);
    }

}
