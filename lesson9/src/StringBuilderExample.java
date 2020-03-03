public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Я изучаю");
        stringBuilder.append(" Java");
        stringBuilder.insert(8, " в IT академии");
        stringBuilder.append(" и Linux !");
        stringBuilder.delete( stringBuilder.length()-1, stringBuilder.length());
        System.out.println(stringBuilder);
    }
}
