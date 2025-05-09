/*
package collectionframework.comparableandcomparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
    int id ;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
class NameComparator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.getName().compareTo(o2.getName());
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        Employee eobj1 = new Employee(1,"aa","pune");
        Employee eobj2 = new Employee(3,"dd","amra");
        Employee eobj3 = new Employee(2,"zz","ahme");
        Employee eobj4 = new Employee(8,"bb","zebra");

        list.add(eobj1);
        list.add(eobj2);
        list.add(eobj3);
        list.add(eobj4);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(list,nameComparator);


    }


}
*/
