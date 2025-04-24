package java8programming.stream.creationoperation;

import java.util.stream.Stream;

class Student
{
    private String name;
    private int age;


}
public class EmptyMethod {
    public static void main(String[] args) {



        // Empty method
        Stream<Student> emptyStream = Stream.empty();

        System.out.println("Element in stream : " + emptyStream.count());  // 0

        //   of(T t) : Creates a stream of single element of type T

       // Stream<Student> s = Stream.of(new Student(),new Student());  // if use this count is 2
        Stream<Student> s = Stream.of(new Student());  // if use this count is 1

        System.out.println("Single element count : " + s.count());  // 1

        System.out.println("===================================");

        // of(T… values) : Creates a stream from values

        Stream<Integer> i = Stream.of(1,2,3,4,4,3,2,1);
        System.out.println("Count of integer value is : " + i.count());   // 8


    }
}
