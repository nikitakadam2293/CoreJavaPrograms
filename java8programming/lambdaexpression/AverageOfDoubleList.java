package java8programming.lambdaexpression;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class AverageOfDoubleList {
    public static void main(String[] args) {

        List<Double>  list = Arrays.asList(10.2,22.9,2.2,3.9);

        double average = list.stream().mapToDouble(n->n).average().orElse(0.0);

        System.out.println("Average of double : " + average);  //Average of double : 9.799999999999999

    }
}
