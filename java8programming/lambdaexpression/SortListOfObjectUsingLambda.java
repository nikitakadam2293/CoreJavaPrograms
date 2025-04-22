package java8programming.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeClass
{
    private int id ;
    private String firstName;
    private String lastName;
    private String address;

    public EmployeeClass() {
    }

    public EmployeeClass(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


public class SortListOfObjectUsingLambda {
    public static void main(String[] args) {

        List<EmployeeClass> list = new ArrayList<>();

        EmployeeClass e1 = new EmployeeClass(1,"aa","bb","pune");
        EmployeeClass e2 = new EmployeeClass(7,"dd","ee","el");
        EmployeeClass e3 = new EmployeeClass(5,"ii","pp","pune");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println("Total Employee Befor Sorting  is : "+ list);

        Comparator<EmployeeClass> comparator = (o1,o2) ->{

           return  o1.getId()-o2.getId() ;
        };

        comparator.compare( e1,  e2);

        Collections.sort(list,comparator);
        System.out.println("Total Employee After Sorting is : " + list);

    }
}
