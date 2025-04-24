package java8programming.practiseprogram;

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
    }
}
