package by.gil;

public class VisaCredit extends CreditCard {

    public VisaCredit(String holder, String number, String data, String type) {
        super(holder, number, data);
        System.out.println(type);
    }

    protected String paymentSystem = "Visa";

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(paymentSystem);
    }
}

