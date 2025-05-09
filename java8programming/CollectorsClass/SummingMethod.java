package java8programming.CollectorsClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of integer : " + sum);

        double avg = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average  of int element : " + avg);

        List<Double> listFloat = Arrays.asList(1.2,2.2,3.2,4.2,5.2);
        double dsum = listFloat.stream().collect(Collectors.summingDouble(Double::doubleValue));

        System.out.println("Sum of double : " + dsum);

        double avgd = listFloat.stream().collect(Collectors.averagingDouble(Double::doubleValue));
        System.out.println("Avg of double : " + avgd);

    }
}
