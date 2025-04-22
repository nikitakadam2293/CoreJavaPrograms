package inheritance;

class Base
{
    public int i;
    public int j;
    public Base()
    {
        System.out.println("Base constructor");
    }
    void fun()
    {
        System.out.println("Inside Base Fun");
    }
    void fun(int x)
    {
        System.out.println("Inside Base Fun with 1 integer arg");
    }
    void gun()
    {
        System.out.println("Inside Base gun");
    }
}
class Derived extends Base
{
    public int x;
    public int y;
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
    }
    void sun()
    {
        System.out.println("Inside Derived sun");
    }
}
public class Inheritnce1 {
    static
    {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
      /*  Derived obj=new Derived();
        obj.fun();
        obj.fun(11);
        obj.gun();
        obj.sun();*/

        Base obj=new Derived();
        //Derived dobj=new Base();
        obj.fun();
        obj.fun(11);
        obj.gun();
       // obj.sun();
    }
}
