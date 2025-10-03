package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

// 28) Find first non-repeated character in a string?

public class FirastNonRepeatedCharacterInString {

    public static void main(String[] args) {

        String str =" java is programming language".replace("\\s+","").toLowerCase();

        Map<String,Long> charCount = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        Map<Character,Long> mm = str.chars().mapToObj(e->(char) e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("ppp" +mm);
         Optional<Character> x =  mm.entrySet().stream().filter(e->e.getValue()==1).map(s->s.getKey()).findFirst();
        System.out.println(x);




        String firstNonrepeatedChar = charCount.entrySet()
                .stream()
                .filter(entry->entry.getValue() == 1)
                .map(entry->entry.getKey())
                .findFirst()
                .get();

        System.out.println("First Non repeated character : " + firstNonrepeatedChar);  // j
    }
}
