package java8programming.stream.findingandmatchingoperation;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstmethod {

    public static void main(String[] args) {

       String firstElement = String.valueOf(Stream.of("first","second","third","four").findFirst());

        System.out.println("First Element is : " +firstElement);   // Optional[first]

        Optional<Integer> fEle = Stream.of(2,3,4,4,5,6,7).findFirst();
        System.out.println("First Integer is : " + fEle);   // Optional[2]

    }
}
