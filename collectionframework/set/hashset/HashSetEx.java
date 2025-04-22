package collectionframework.set.hashset;

import java.util.HashSet;

class Student
{
    String name, sname;
    int id;

    Student(String name, String sname, int  id)
    {
        this.name=name;
        this.sname= sname;
        this.id=id;

    }

}
public class HashSetEx {
    public static void main(String[] args) {

        HashSet<Student> hset = new HashSet<>();
        Student s1 = new Student("ram","pqr",11);
        Student s2 = new Student("shyam","abc",14);
        Student s3 = new Student("namu","xyz",18);

        hset.add(s1);
        hset.add(s2);
        hset.add(s3);

        for (Student s : hset)
        {
            System.out.println(s.name + "  :" + s.sname +"  :" + s.id);
        }
    }
}
