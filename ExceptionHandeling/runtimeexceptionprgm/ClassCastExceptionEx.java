package ExceptionHandeling.runtimeexceptionprgm;

public class ClassCastExceptionEx {
    public static void main(String[] args) {
        Object o = new Object();
        String s =(String) o;
    }
}

/*
* Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
	at ExceptionHandeling.runtimeexceptionprgm.ClassCastExceptionEx.main(ClassCastExceptionEx.java:6)
*/