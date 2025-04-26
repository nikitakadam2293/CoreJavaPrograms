package java8programming.methodreference;

import java.util.List;

public class StreamMain {

    public static void main(String[] args) {

      List<Integer> integers=  List.of(14,13352,763,222,2,3,4455);

        System.out.println("Using List ");
        System.out.println(integers);

        // using lambda
        System.out.println("Using Lambda ::");
        integers.stream().forEach(e->
        {
            System.out.println(e);

        });

        // method reference

        System.out.println("Using Method Reference ::");
        integers.stream().forEach(System.out::println);
    }
}
