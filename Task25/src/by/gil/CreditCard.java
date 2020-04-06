package by.gil;

public class CreditCard extends AbstractCard implements ShowInfo {


    public CreditCard(String holder, String number, String data) {
        super(holder, number, data);
    }

    protected boolean creditOpportunity = true;
    protected int maxCreditSum = 10_000;

    @Override
    public void showInfo() {
        System.out.println(creditOpportunity);
        System.out.println("Максимальная сумма задолжности " + maxCreditSum + ".00 BYN");
    }
}
