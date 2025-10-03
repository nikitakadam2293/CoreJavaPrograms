package java8programming.practiseprogram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMap {


    public static void main(String[] args) {

        List<List<String>> flatmap = Arrays.asList(
                Arrays.asList("aa","bb","cc"),
                Arrays.asList("cc","dd","bb","ggg")
        );

        /*flatmap.stream().flatMap(List::stream).forEach(System.out::println);

        System.out.println("====REMOVING DUBLICATE USING DISTINCT");
        flatmap.stream().flatMap(List::stream).distinct().forEach(System.out::println);

        System.out.println("==== REMOVING DUBLICATE WITHOUT DISTINCT +++++=====");

     Map<String,Long> dd=    flatmap.stream().flatMap(List::stream).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

     String s= dd.keySet().toString();
        System.out.println(s);

*/        System.out.println("REMOVING DUBLICATE USING SET");

        Set set = flatmap.stream().flatMap(List::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("MAINTAIN INSERTIO ORDER");

        Set<String> orderedSet = flatmap.stream()
                .flatMap(List::stream)
                .distinct()  // Remove duplicates
                .sorted(Comparator.reverseOrder())  // Sort
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(orderedSet);
    }
}





