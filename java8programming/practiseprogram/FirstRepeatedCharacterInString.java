package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 27) Find first repeated character in a string?

public class FirstRepeatedCharacterInString {

    public static void main(String[] args) {

        String str = "java  is a programming language".replace("\\s+","").toLowerCase();

        Map<String, Long>  charCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeateChar = charCount.entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(entry->entry.getKey())
                .findFirst()
                .get();

        System.out.println("First Repeated Character : " +firstRepeateChar );

    }
}
