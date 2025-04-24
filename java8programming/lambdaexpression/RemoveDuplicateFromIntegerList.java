package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromIntegerList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,1,2,3,4,5,6,6,7,4,4);

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique in list " + uniqueList );




    }
}
