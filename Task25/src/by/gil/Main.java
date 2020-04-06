package by.gil;

public class Main {

    public static void main(String[] args) {

        VisaDebit visaDebit = new VisaDebit("CARDHOLDER", "4235 1111 1111 1111", "20/20" , "Gold");
        VisaCredit visaCredit = new VisaCredit("CARDHOLDER", "4235 1111 1111 2222", "15/20" , "Gold");
        NFCVisa nfcVisa = new NFCVisa("CARDHOLDER", "4235 1111 1111 2222", "15/20" , "Gold", true);



    }
}
