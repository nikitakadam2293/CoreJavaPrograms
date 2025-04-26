package java8programming.methodreference;

import java.util.function.Supplier;

class Person
{
   private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

public class RefersInstanceMethod
{
    public static void main(String[] args) {

        Person person = new Person("aa");

        Supplier<String> getName = person::getName;

        String n = getName.get();
        System.out.println(n);

    }
}
