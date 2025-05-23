package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElementInArray {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pen","Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String,Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map.Entry<String,Long> frequency = count.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Most Frequent Element : "+ frequency.getKey() );
        System.out.println("Count : " + frequency.getValue());
    }
}
