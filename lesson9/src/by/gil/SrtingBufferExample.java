package by.gil;

public class SrtingBufferExample {

    private StringBuffer stringBuffer;

    public SrtingBufferExample() {
        stringBuffer = new StringBuffer();
    }

    private void print (){
        System.out.println(stringBuffer);
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public static void main(String[] args) {
        SrtingBufferExample example = new SrtingBufferExample();
        example.getStringBuffer().append("i");
        example.print();
        example.getStringBuffer().append(" love ");
        example.print();
        example.getStringBuffer().append("Java!");
        example.print();
        example.getStringBuffer().insert(0 , "Hello ");
        example.print();
    }
}
