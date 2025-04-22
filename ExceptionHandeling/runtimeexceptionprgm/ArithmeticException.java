package ExceptionHandeling.runtimeexceptionprgm;

public class ArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b= 0;

        int c = a/b;
        System.out.println("c "+ c);

        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandeling.runtimeexceptionprgm.ArithmeticException.main(ArithmeticException.java:8)

        * */
    }
}
