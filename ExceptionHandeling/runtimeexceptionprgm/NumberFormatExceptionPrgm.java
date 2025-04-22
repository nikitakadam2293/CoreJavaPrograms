package ExceptionHandeling.runtimeexceptionprgm;

public class NumberFormatExceptionPrgm {
    public static void main(String[] args) {
        String n = "abc";
        int b = Integer.parseInt(n);
    }
}
/*
* Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
 */