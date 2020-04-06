package by.gil;

public class DebitCard extends AbstractCard implements ShowInfo {

    public DebitCard(String holder, String number, String data) {
        super(holder, number, data);
    }

    protected boolean creditOpportunity = false;


    @Override
    public void showInfo() {
        System.out.println("creditOpportunity" + creditOpportunity);
    }
}
