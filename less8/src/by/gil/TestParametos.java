package by.gil;

public class TestParametos {
    public static void main(String[] args) {
        int value1 = 100;
        Parametr parametr = new Parametr();
        parametr.value1= 50;

        TestParametos test = new TestParametos();
        test.print(value1);
        value1 +=1;
        test.print(value1);

    }
    void print (int i){
        System.out.println(i);
        i++;
    }
    void print (Parametr p){

        System.out.println(p.value1);

    }
}

class Parametr {
    int value1;

}