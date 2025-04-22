package objectclassmethod;

class Employee implements Cloneable
{
    int eid;
    String name;
    int salary;

    public Employee(int eid , String name, int salary)
    {
        this.eid=eid;
        this.name=name;
        this.salary=salary;

    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}


public class CloneMethod {


    public static void main(String[] args) throws CloneNotSupportedException {
        Employee eobj = new Employee(11,"nikita" ,12);

        System.out.println( "First emp :"+ "eid : "+eobj.eid + " name  : "+ eobj.name + " salary : "+ eobj.salary);

        Employee eobj2 = null;
        try
        {// Employee
            eobj2 =(Employee) eobj.clone();

            System.out.println( "Second emp  : " + "eid : "+eobj2.eid + " name  : "+ eobj2.name + " salary : "+ eobj2.salary);

        }
        catch (CloneNotSupportedException e)
        {

        }

            eobj.name= "HELLO ";
          //System.out.println( "Second emp  : " + "eid : "+eobj2.eid + " name  : "+ eobj2.name + " salary : "+ eobj2.salary);

           System.out.println("Next Second Emp : " +  "eid : "+  eobj2.eid + " name  : "+ eobj2.name + " salary : "+ eobj2.salary);

        System.out.println( "Next  First emp :"+ "eid : "+eobj.eid + " name  : "+ eobj.name + " salary : "+ eobj.salary);


    }


}
