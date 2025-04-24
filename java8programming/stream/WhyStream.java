package java8programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WhyStream {
    public static void main(String[] args) {

        List<String>  list = new ArrayList<>();
        list.add("ABCD");
        list.add("XNBCD");
        list.add("ALLCD");
        list.add("OPBCD");
        list.add("OBCD");
        list.add("ABCD");
        list.add("OBCOUTD");
        list.add("OBPD");
        list.add("OOCD");

        // FILTER all elements which starts with char 'A'  or 'O' and length is less than 4

       /* for(int i=0; i<list.size(); i++)
        {
            String str = list.get(i);

            if((str.startsWith("A") || str.startsWith("O")) && str.length() <=4 )
            {
                System.out.println(str);
            }

        }*/

        List<String> output = new ArrayList<>();

        for(String s: list)
        {
            if((s.startsWith("A")|| s.startsWith("O"))&& s.length()<=4)
            {
                output.add(s);
                System.out.println(s);
            }

        }
        System.out.println("Output is : "+ output);

        System.out.println("========================================");
        list.stream().filter(s->(s.startsWith("A") || s.startsWith("O")) ).filter(s->s.length() <= 4)
                .forEach(a-> System.out.println( "Filter data : " +a));

        System.out.println("========================================");
        System.out.println("========================================");

        System.out.println("Original String is : " + list);

        System.out.println("========================================");

        list.stream().filter(s->(s.startsWith("A") || s.startsWith("O"))).filter(s->s.length() <=4).
                sorted().
                distinct().
                forEach(a->
                {
                    System.out.println("Filter data : " + a);
                });   // Internal


        List<String> result = list.stream().
                filter(s->(s.startsWith("A")|| s.startsWith("O"))).
                filter(s->s.length()<=4).
                sorted().
                distinct().
                collect(Collectors.toList());

        System.out.println("Final Result ..........========" + result);



        Stream<String> resultList = list.stream().filter(s->(s.startsWith("A") || s.startsWith("O"))).filter(s->s.length()<= 4).sorted().distinct();
        resultList.sorted().distinct();
//        System.out.println("++++++++++++++Final result : ++++++++++" + result);

            long c = resultList.sorted().distinct().count();  // when we perform terminal operation,
        // it means we have consumed that stream so we can not use same stream again

        resultList.sorted().count();  // trying to perform op on already consumed stream will result
        //  in exception

        System.out.println("++++++++++++++Final result : ++++++++++" + result);


        int noOfCore = Runtime.getRuntime().availableProcessors();
        System.out.println("No of CPU Core : " + noOfCore);

        IntStream.of(new int[] {4,7,1,8,3,9,7}).filter(i->i>5).distinct().max();

    }
}
