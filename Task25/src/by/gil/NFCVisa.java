package by.gil;

public class NFCVisa extends VisaDebit{

    //protected boolean NFCPossibility;

    public NFCVisa(String holder, String number, String data, String type, boolean NFCPossibility) {
        super(holder, number, data, type);

        if (NFCPossibility == true) {
            System.out.println(" Карточка поддерживает бесконтактную оплату");
        } else {
            System.out.println(" Карточка не поддерживает бесконтактную оплату");
        }
    }




}

