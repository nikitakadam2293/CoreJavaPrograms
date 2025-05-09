package java8programming.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

      int count =   list.stream().collect(Collectors.reducing(10,(a,b)->a+b));
        System.out.println("Reducing : " + count);   // 25
    }
}
