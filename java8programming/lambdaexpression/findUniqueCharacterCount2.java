package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findUniqueCharacterCount2
{
    public static void main(String[] args) {
            String s = "abcdabcbaaaddd";
            Map<Character,Long> res  = s.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println("Counting each character  : "+ res);

        }
    }
/*
* Explanation of .mapToObj(c -> (char) c):
.mapToObj(...) is used to convert each int (from IntStream) to an object type — in this case, a Character.

c -> (char) c is a lambda expression:

c is each int Unicode value (like 97 for 'a', 98 for 'b', etc.)

(char) c casts the integer to a character.

The result is a Stream<Character>, which is what you need when working with stream-based grouping, counting, etc.

Example:


String s = "abc";
s.chars()           // IntStream of 97, 98, 99
 .mapToObj(c -> (char) c)  // Stream<Character> of 'a', 'b', 'c'
 .forEach(System.out::println);
 *
Output:*/

