package objectclassmethod;

class Employee1
{
    String name ;
    int salary ;

    Employee1 (int salary,String name)
    {
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee Name is "+ name + " Salary : "+ salary;
    }
}
public class ToStringMethod {

    public static void main(String[] args) {
        Employee1 obj=new Employee1(12, "nikita");
        System.out.println(obj);

    }
}
