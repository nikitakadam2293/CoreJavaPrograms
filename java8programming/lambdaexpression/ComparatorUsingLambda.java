package java8programming.lambdaexpression;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
    private String firstname;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstname, String lastName, int age, double salary) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*class FirstnameComparator implements Comparator<Employee>
{

  public  int compare(Employee o1, Employee o2)
  {
      return o1.getAge()- o2.getAge();
  }
}*/


public class ComparatorUsingLambda {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee eobj1 = new Employee("ananya","xyz",90,98);
        Employee eobj2 = new Employee("shravani","pqr",24,998);
        Employee eobj3 = new Employee("sharvi","lkk",20,98);
        Employee eobj4 = new Employee("aaa","xyz",30,98);

        list.add(eobj1);
        list.add(eobj2);
        list.add(eobj3);
        list.add(eobj4);

        System.out.println("List Before : " + list);

      /*  FirstnameComparator firstnameComparator = new FirstnameComparator();
        Collections.sort(list,firstnameComparator);*/

        System.out.println("==================");


       Comparator<Employee> cm = (o1,o2)->
       {
         return o1.getAge()-o2.getAge();

       };
        cm.compare(eobj1,eobj2);


        System.out.println("==================");

        Collections.sort(list,cm);
        System.out.println("List After : " + list);




    }
}
