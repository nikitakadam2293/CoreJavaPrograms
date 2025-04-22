package ExceptionHandeling.runtimeexceptionprgm;

public class ArrayIndexOutOfBoundEx {

    public static void main(String[] args) {

        String s [] = {"1","2"};//new String[5];
       // s[6]= "ab";

        System.out.println(s[3]);
    }

}
/*
* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
	at ExceptionHandeling.runtimeexceptionprgm.ArrayIndexOutOfBoundEx.main(ArrayIndexOutOfBoundEx.java:8)
*/