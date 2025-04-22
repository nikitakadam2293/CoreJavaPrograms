package collectionframework.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employee1 implements Comparable<Employee1>
    {
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        public Employee1(String firstName, String lastName, int age, double salary) {
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
            return "Employee1{" +
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
            //return (int) (this.getSalary() - o.getSalary());
           // return  this.getFirstName().compareTo(o.getFirstName());

           // if first name is same for 2 object

           int temp = this.getFirstName().compareTo(o.getFirstName());

           if(temp ==0)
           {
               return  this.getLastName().compareTo(o.getLastName());
           }

           return temp;

        }
    }

    public class ComparableScenario1
    {
        public static void main(String[] args) {

            List<Employee1> employeeList = new ArrayList<>();

            Employee1 emp1 = new Employee1("A", "Language", 25,90000 );
            Employee1 emp2 = new Employee1("F", "Strong", 32,70000 );
            Employee1 emp3 = new Employee1("D", "program", 29,60000 );
            Employee1 emp4 = new Employee1("A", "Java", 35,850000 );
            Employee1 emp5 = new Employee1("P", "Coffee", 20,170000 );

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


