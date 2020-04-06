package by.gil;

public class VisaDebit extends DebitCard{


    public VisaDebit(String holder, String number, String data, String type) {
        super(holder, number, data);
        System.out.println(type);
    }

    protected String paymentSystem = "Visa";

    @Override
    public void showInfo() {
        System.out.println(number + " " + data + " " +  holder);
        System.out.println("creditOpportunity" + creditOpportunity);
        System.out.println(paymentSystem);
    }
}
