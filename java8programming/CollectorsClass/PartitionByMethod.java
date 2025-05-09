package java8programming.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,11,33,44,5,12,22);

       Map<Boolean,List<Integer>> l =  list.stream().collect(Collectors.partitioningBy(n->n%2 == 0));

        System.out.println(l); // {false=[1, 3, 11, 33, 5], true=[2, 44, 12, 22]}

      Map<Boolean, List<Integer>>  ll =   list.stream().collect(Collectors.partitioningBy(m->m>20));

        System.out.println("::==" + ll);   //::=={false=[1, 2, 3, 11, 5, 12], true=[33, 44, 22]}

       long count =  list.stream().collect(Collectors.counting());
        System.out.println("Counting is : " + count);  //9



    }
}
