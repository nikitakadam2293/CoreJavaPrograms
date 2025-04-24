package java8programming.stream.reducingoperation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ReduceMethod {
    public static void main(String[] args) {

        int sum = Arrays.stream(new int[] {7,5,1,9,2,8}).reduce(0,(a,b)->a+b);

        System.out.println("Sum  : "+ sum);   // 32

        OptionalInt sum1 = Arrays.stream(new int[] {3,3,4,10}).reduce((c,d)->c+d);
        System.out.println("....sum1 .... " + sum1);  // 20

        int min = Arrays.stream(new int[] {7,5,1,9,2,8}).min().getAsInt();
        System.out.println("Minimum no in array : " + min);  // 1

        int max= Arrays.stream(new int[] {7,5,1,9,2,8}).max().getAsInt();
        System.out.println("Mximum no in array : " + max);   // 9

        int count = (int) Arrays.stream(new int[] {7,5,1,9,2,8}).count();
        System.out.println("Total count is : " + count);   // 6

        List<Integer> c = Arrays.asList(7,5,1,9,2,8);
        List<Integer> newCount = c.stream().filter(a->a>4).toList();
        System.out.println("no >4 is  :  " +newCount);  //no >4 is  :  [7, 5, 9, 8]


        List<Integer> i = c.stream().limit(4).collect(Collectors.toList());
        System.out.println("limit() method : " + i);  // limit() method : [7, 5, 1, 9]



    }
}
