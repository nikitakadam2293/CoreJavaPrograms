package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenAndOddNoInList {
    public static void main(String[] args) {

        List<Integer> num= Arrays.asList(11,2,33,2,111,554,33,55,55);

        List evenNo = num.stream().filter(n->n % 2 == 0).collect(Collectors.toList());

        System.out.println("Even No : " + evenNo);  // Even No : [2, 2, 554]

        List oddNo = num.stream().filter(no->no % 2 !=0).collect(Collectors.toList());

        System.out.println("Odd No : " + oddNo);  // Odd No : [11, 33, 111, 33, 55, 55]

    }
}
