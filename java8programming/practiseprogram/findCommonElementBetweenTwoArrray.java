package java8programming.practiseprogram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


// 17) How do you find common elements between two arrays?

public class findCommonElementBetweenTwoArrray {

    public static void main(String[] args) {


        List<Integer> l1 = Arrays.asList(1,3,2,4,10,33,99,44);
        List<Integer> l2 = Arrays.asList(1 ,44,22,2,3,99,66);

        System.out.println("Integer::");
        l1.stream().filter(l2::contains).forEach(System.out::println);

        /*
        Integer::
            1
            3
            2
            99
            44
            */

        System.out.println("Ayn Number :::");
        List<? extends Number> list1 = Arrays.asList(1.11,3,2,4,10,33,99,44.0);
        List<? extends Number> list2 = Arrays.asList(1.11 ,44,22,2,3,99,66);

        list1.stream().filter(list2::contains).forEach(System.out::println);

        /*1.11
        3
        2
        99*/
    }
}
