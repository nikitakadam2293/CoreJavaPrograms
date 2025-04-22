package ExceptionHandeling.runtimeexceptionprgm;

public class NegativeArraySizeExceptionPrgm {

    public static void main(String[] args) {

        String a[] = new String[-4];
       // a[1] = "a";
    }
}

/*
* Exception in thread "main" java.lang.NegativeArraySizeException: -4
	at ExceptionHandeling.runtimeexceptionprgm.NegativeArraySizeExceptionPrgm.main(NegativeArraySizeExceptionPrgm.java:7)
*/
