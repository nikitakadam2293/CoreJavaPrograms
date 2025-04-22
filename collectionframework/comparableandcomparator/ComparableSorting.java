package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee1>
{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

   public void setFirstName(String firstName)
   {
       this.firstName=firstName;
   }
    public String getFirstName()
    {
        return firstName;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
/*@Override
    public int compareTo(EmployeeComparator o)
    {
     //   return this.age- o.getAge();

        return (int) (this.getSalary() - o.getSalary());
    }*/

    @Override
    public int compareTo(Employee1 o) {
        return (int) (this.getSalary() - o.getSalary());
       // return  this.getFirstName().compareTo(o.getFirstName());

    }
}

public class ComparableSorting
{
    public static void main(String[] args) {

        List<Employee1> employeeList = new ArrayList<>();

        Employee1 emp1 = new Employee1("Test", "Java", 25,90000 );
        Employee1 emp2 = new Employee1("Abcd", "Language", 32,70000 );
        Employee1 emp3 = new Employee1("Xyz", "program", 29,60000 );
        Employee1 emp4 = new Employee1("Network", "Strong", 35,850000 );
        Employee1 emp5 = new Employee1("Karve Nagar", "Coffee", 20,170000 );

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("Before Sorting : " + employeeList);

        //utility class => static methods

        Collections.sort(employeeList);
        System.out.println("After Sorting : " + employeeList);

    }
}
