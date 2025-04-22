package collectionframework.set.linkedhashset;

import java.util.LinkedHashSet;

class Student
{
    int id ;
    String name;
    String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }


}
public class AddingCustomObjectToLinkedHashSet {


    public static void main(String[] args) {

        LinkedHashSet<Student> l = new LinkedHashSet<>();

        Student s1 = new Student(1,"abc" , "pune");
        Student s2 = new Student(2,"def" , "mumbai");
        Student s3 = new Student(3,"ghi" , "latur");

        l.add(s1);
        l.add(s2);
        l.add(s3);
        System.out.println("LinkedHashSet is  : ");


        for(Student s :l )
        {
            System.out.println("Id : " +s.id + " name : " +s.name + " city :  " +s.city);
        }

    }
}
