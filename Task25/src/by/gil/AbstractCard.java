package by.gil;

public abstract class AbstractCard {
    protected String holder;
    protected String number;
    protected String data;


    public AbstractCard(String holder, String number, String data) {
        this.holder = holder;
        this.number = number;
        this.data = data;
        System.out.println(number + " " + data + " " +  holder);
    }



}


