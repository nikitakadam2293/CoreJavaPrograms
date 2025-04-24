package java8programming.practiseprogram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

// 18) Reverse each word of a string using Java 8 streams?

public class ReverseEachWordInString {

    public static void main(String[] args) {

        String str = "java programming language";

        String reverse = Arrays.stream(str.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));

        System.out.println(reverse);
    }
}
