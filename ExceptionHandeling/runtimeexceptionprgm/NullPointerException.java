package ExceptionHandeling.runtimeexceptionprgm;

public class NullPointerException {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
    }
}
/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
	at ExceptionHandeling.runtimeexceptionprgm.NullPointerException.main(NullPointerException.java:6)


* */