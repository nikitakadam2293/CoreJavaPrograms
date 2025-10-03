package java8programming.practiseprogram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// 27) Find first repeated character in a string?

public class FirstRepeatedCharacterInString {

    public static void main(String[] args) {

        String str = "jaaaavvvvvvvvvvvvvvvvva  is a programming language".replace("\\s+","").toLowerCase();


        System.out.println("  FIND MOST REPEATED CHARACTER  ");

        Map<String,Long>  m = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(m);

        String s =  m.entrySet().stream().max(Map.Entry.comparingByValue()).map(e->e.getKey()).orElse(null);

        System.out.println("=======================   "+ s+ "  ===========================");


        System.out.println(" FIND FIRST REPEATED CHARACTER");

        Map<String, Long>  charCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeateChar = charCount.entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(entry->entry.getKey())
                .findAny()                // .findFirst()
                .get();

        System.out.println("First Repeated Character : " +firstRepeateChar );


    }
}
