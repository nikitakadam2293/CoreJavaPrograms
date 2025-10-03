package java8programming.practiseprogram;

// 3) How do you find frequency of each character in a string using Java 8 streams?

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {
    public static void main(String[] args) {

        String str = "Java Program ZZz pp";

        // COUNTING ONLY CHARACTER NOT SPACE

        String newStr = str.replaceAll("\\s+","");  // remove space count

        Map<Character,Long> map = newStr.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("+++++ "+ map);


        // COUNTING  CHARACTER AND  SPACE ALSO

        Map<Character,Long> count = str.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("count is : " + count);


       // Map<Character,Long> count = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        List<Character>  list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('a');
        list.add('z');


      Map<Character,Long>  mm=   list.stream().map(Character::toUpperCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("mmmm   "+  mm);

      Map<Character,Long> counttt =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Count of character in list is : " +counttt);

        System.out.println('a'+'b');  //  195
    }
}
