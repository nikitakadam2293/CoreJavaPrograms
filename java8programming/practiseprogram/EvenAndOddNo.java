package java8programming.practiseprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  Given a list of integers, separate odd and even numbers?

public class EvenAndOddNo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(10);
        list.add(18);
        list.add(2);
        list.add(8);
        list.add(21);

       List<Integer> even =   list.stream().filter(s-> s%2 == 0).collect(Collectors.toList());
        System.out.println("Even No : " + even);  // Even No : [10, 18, 2, 8]


        List<Integer> odd = list.stream().filter(o-> o%2 !=0).collect(Collectors.toList());
        System.out.println("odd no is : " + odd);   // odd no is : [11, 21]

        System.out.println("============================");
        System.out.println(list.stream().collect(Collectors.partitioningBy(e->e%2==0)));
        // {false=[11, 21], true=[10, 18, 2, 8]}

    }
}