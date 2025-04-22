package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeEx
{
   private String firstName;
    private String lastName;
    private  int age;
    private  long salary;

    public EmployeeEx(String firstName, String lastName, int age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeEx{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class ComparatorUsingLambdaEx2 {
    public static void main(String[] args) {

        List<EmployeeEx> list = new ArrayList<>();

        EmployeeEx obj1 = new EmployeeEx("rani","pr",60,33);
        EmployeeEx obj2 = new EmployeeEx("cc","pr",30,93);
        EmployeeEx obj3 = new EmployeeEx("ee","pr",50,30);
        EmployeeEx obj4 = new EmployeeEx("gg","pr",80,83);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        System.out.println("List Before : " + list);

        Comparator<EmployeeEx> cm =( o1,  o2 )->{

           return o1.getFirstName().compareTo(o2.getFirstName());

        };

        cm.compare(obj1,obj2);
        Collections.sort(list,cm);

        System.out.println("After List : " + list);


    }
}
