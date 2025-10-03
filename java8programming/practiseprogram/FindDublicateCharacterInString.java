package java8programming.practiseprogram;


// 26) Print duplicate characters in a string?

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// 26) Print duplicate characters in a string?

public class FindDublicateCharacterInString {

    public static void main(String[] args) {

        String  str= "Java is a language of programming ".replace("\\s+","").toLowerCase();

        Set<String>  uniqueChars = new HashSet<>();

        Set<String> dublicateChar = Arrays.stream(str.split("")).filter(ch-> ! uniqueChars.add(ch)).collect(Collectors.toSet());

        System.out.println("Dublicate Character : " + dublicateChar);


        Map<Character,Long>  dd = str.chars().mapToObj(e->(char) e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("$$$$$$" + dd);

        dd.entrySet().stream().filter(entry->entry.getValue()>1).forEach(System.out::println);

/*
        String input = "programming";

        Map<Character, Long> duplicateChars = input.chars() // convert to IntStream
            .mapToObj(c -> (char) c) // convert int to Character
            .collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            ));

        System.out.println("Duplicate characters:");
        duplicateChars.entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .forEach(entry ->
                System.out.println(entry.getKey() + " : " + entry.getValue())
            );
    }

* */

    }
}
