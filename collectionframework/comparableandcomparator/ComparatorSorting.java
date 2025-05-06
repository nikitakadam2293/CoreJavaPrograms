package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeComparator
{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public EmployeeComparator(String firstName, String lastName, int age, double salary) {
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
        return "EmployeeComparator{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}

class FirstNameComparator implements Comparator<EmployeeComparator>
{
    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2)
    {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}


public class ComparatorSorting {

    public static void main(String[] args) {

        List<EmployeeComparator> employeeList = new ArrayList<>();

        EmployeeComparator emp1 = new EmployeeComparator("Test", "Java" , 25, 90000);
        EmployeeComparator emp2 = new EmployeeComparator("Abcd", "Language" , 32, 70000);
        EmployeeComparator emp3 = new EmployeeComparator("Xyz", "Program" , 29, 60000);
        EmployeeComparator emp4 = new EmployeeComparator("Network", "Strong" , 35, 850000);
        EmployeeComparator emp5 = new EmployeeComparator("Karve Nagar", "Coffee" , 20, 130000);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("_______________________________");

        // First name of all employee

        List<String> firstName1 =  employeeList.stream().map(employee->employee.getFirstName()).collect(Collectors.toList());
        System.out.println("List of First Name : " + firstName1);

        List<String> fn = employeeList.stream().map(EmployeeComparator::getFirstName).collect(Collectors.toList());
        System.out.println("Get first name using method reference :  " + fn);

        System.out.println("+++++++++++++++++++++++++");

        List<Double> salary = employeeList.stream().map(employee->employee.getSalary()).collect(Collectors.toList());
        System.out.println("Salary is : " + salary);

       // get salary using collection

        List<Double> slCollection = new ArrayList<>();
        for (EmployeeComparator sl : employeeList )
        {
            slCollection.add(sl.getSalary()) ;
        }

        System.out.println("Print Salary using Collection : " + slCollection);

        System.out.println("+++++++++++++++++++++++++");

        List<Double> sl = employeeList.stream().map(EmployeeComparator::getSalary).collect(Collectors.toList());
        System.out.println("Get Salary using method reference : " + sl);

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("_______________________________");


        System.out.println("Before sorting : "+ employeeList );

        // utility class => static methods

        FirstNameComparator firstNameComparator = new FirstNameComparator();
        Collections.sort(employeeList,firstNameComparator );

        System.out.println("After sorting name : " +employeeList);


        Comparator<EmployeeComparator> ageComparator  = new Comparator<EmployeeComparator>() {
            @Override
            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(employeeList , ageComparator );
        System.out.println("After sorting age " + employeeList);


        Comparator<EmployeeComparator> salaryComparator = new Comparator<EmployeeComparator>(){

           @Override
            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
             return (int)(o1.getAge()-o2.getAge());
            }
        };


    }
}
/*
Comparator<EmployeeComparator> ageComparator = new ageComparator<EmployeeComparator>()
{
    @Override
    public  int compare(EmployeeComparator o1, EmployeeComparator o2)
    {
        return o1.getAge()
    }
};*/

