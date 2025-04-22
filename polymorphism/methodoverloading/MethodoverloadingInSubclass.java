package polymorphism.methodoverloading;

class SuperClass
{
    void msg(int x, int y)
    {
        System.out.println("Parent class");
    }

}
class ChildClass extends SuperClass
{
    void msg(int  x, int  y)
    {
        System.out.println("Child class");
    }

}

public class MethodoverloadingInSubclass //extends ChildClass
{

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.msg(1,1);  //child
      //  obj.msg("java","abc");

        SuperClass o = new  ChildClass();
        o.msg(1,33);    //Child class  //msg method override in child



    }
}
