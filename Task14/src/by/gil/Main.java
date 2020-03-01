package by.gil;

public class Main {

    public static void main(String[] args) {
        int marks[] = new int[20];
        int maxMarks = marks[0];
        int nubmer = 0;
        int yet = 0;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
        }

        for (int i = 0; i < marks.length; i++) {
            if (maxMarks < marks[i]) {
                maxMarks = marks[i];
                nubmer = i + 1;
               /* if ( nubmer > i + 1) {
                    yet = i +1 ;
                }*/
            }
        }
        System.out.println("\nМаксимальная оценка = " + maxMarks + " Соответсвует ученику(ам) номер " + nubmer);
    }

}

