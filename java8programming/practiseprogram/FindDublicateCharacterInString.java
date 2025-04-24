package java8programming.practiseprogram;


// 26) Print duplicate characters in a string?

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 26) Print duplicate characters in a string?

public class FindDublicateCharacterInString {

    public static void main(String[] args) {

        String  str= "Java is a language of programming ".replace("\\s+","").toLowerCase();

        Set<String>  uniqueChars = new HashSet<>();

        Set<String> dublicateChar = Arrays.stream(str.split("")).filter(ch-> ! uniqueChars.add(ch)).collect(Collectors.toSet());

        System.out.println("Dublicate Character : " + dublicateChar);
    }
}
