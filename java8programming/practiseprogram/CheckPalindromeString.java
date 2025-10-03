package java8programming.practiseprogram;

import java.io.InputStream;
import java.util.List;
import java.util.stream.IntStream;

//23) Palindrome program using Java 8 streams

public class CheckPalindromeString {
    public static void main(String[] args) {

        String str = "nayanll";

        boolean pal = IntStream.range(0,str.length()/2).noneMatch(i-> str.charAt(i) != str.charAt(str.length()-i-1));
        if(pal)
        {
            System.out.println(str + "  is palindrom ");
        }
        else
        {
            System.out.println(str + " is not palindrom");
        }

        // new


      boolean p=   IntStream.range(0,str.length()/2).allMatch(e->str.charAt(0) == str.charAt(str.length()-e-1));
        System.out.println(p);


        String rev =  new StringBuffer(str).reverse().toString();

        if(rev.equals(str))
        {
            System.out.println("PALINDROM");
        }
        else
        {
            System.out.println("NOT PALINDROM");
        }
















      /*  boolean ispalinddrom =  IntStream.range(0,str.length()/2).allMatch(e->str.charAt(0) == str.charAt(str.length()-e-1));
        System.out.println("Palll : " + ispalinddrom);

       String ss = new StringBuilder(str).reverse().toString();
       if(str.equals(ss))
       {
           System.out.println("sTRING IS PAL");
       }
       else
       {
           System.out.println("sTRING NOT PALINDROM ");
       }*/
    }
}
