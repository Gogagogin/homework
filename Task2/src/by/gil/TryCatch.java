package by.gil;

public class TryCatch {
    //Here I check, is the value integer or not
    public static boolean isInt(String s) {
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}

