package Static;

class Base
{
    static
    {
        System.out.println("parent static block");
    }
    {
        System.out.println("Parent instance block");
    }
    Base()
    {
        System.out.println("Parent constructor");
    }
}
public class Staticblockscenario  extends Base
{
  /*  static
    {
        System.out.println("Child static block");
    }
    {
        System.out.println("Child instance block");
    }
    Staticblockscenario()
    {
        System.out.println("Child constructor ");
    }
    public static void main(String[] args) {
        Base obj=new Base();

    }
*/
   /* static {
        System.out.println(" child Static block");


  }
    {

        System.out.println("child  Instance block");
        Staticblockscenario.fun();

        instanceMethod();
    }

    static void fun()
    {
        //Staticblockscenario.instanceMethod();
        System.out.println("static method==========");
    }
     void instanceMethod()
    {
        System.out.println("instance method==========");
    }

    public static void main(String[] args) {
        Staticblockscenario obj=new Staticblockscenario();
    }*/
   /* static class NestedClass{
       static void fun()
        {
            System.out.println("nested class");
        }
    }

    public static void main(String[] args) {
        Staticblockscenario.NestedClass obj=new Staticblockscenario.NestedClass();  //this line
        // can not call instance block of parent class and constructor of parent class

        obj.fun();
    }
*/
    static int a=2;
    Staticblockscenario()
    {
       a++;
    }

    static void fun()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Staticblockscenario obj=new Staticblockscenario(); //0
        System.out.println(Staticblockscenario.a);  //3
        Staticblockscenario.fun();  //3
    }
}
