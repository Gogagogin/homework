package by.gil.man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man ();
        System.out.println(man.getHead().getHairLength());
        int currentHairLtnght = man.getHead().getHairLength();
        currentHairLtnght -= 1;
        System.out.println(currentHairLtnght);

        man.getHead().setHairLength(currentHairLtnght);
        System.out.println(man.getHead().getHairLength());
    }
}
