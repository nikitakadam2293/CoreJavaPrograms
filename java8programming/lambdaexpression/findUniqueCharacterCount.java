package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findUniqueCharacterCount {

    public static void main(String[] args) {
        String s = "abcdabcbaaaddd";

        char [] charArray = s.toCharArray();

        List<Character> list = new ArrayList<>();

        for(char c : charArray)
        {
            list.add(c);
        }

        Map<Character,Long> result =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);

        Map<Character,Long> res  = s.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Counting each character using mapToObj : "+ res);

    }
}
