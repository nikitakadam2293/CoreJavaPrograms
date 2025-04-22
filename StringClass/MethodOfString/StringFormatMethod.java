package StringClass.MethodOfString;

public class StringFormatMethod {

    public static void main(String[] args) {
        String str = "Hello %s I am Java from %d  starting ";

        String res = String.format(str, "world", 11);
        System.out.println(res);
    }
}
