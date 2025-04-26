package java8programming.methodreference;

import java.util.function.BiFunction;

class Person1
{
    private String name;
    private String age;

    public Person1(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
public class ReferenceToConstructor
{
    public static void main(String[] args) {

        BiFunction<String, String , Person1> personConstructor = Person1::new;

        Person1 person1  = personConstructor.apply("aa","22");

        System.out.println(person1.getAge());
        System.out.println(person1.getName());

    }
}
