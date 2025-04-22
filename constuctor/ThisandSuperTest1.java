package constuctor;

class ThisSuper1
{
    ThisSuper1()  //4
    {
        System.out.println("parent class no arg constructor");
    }
    ThisSuper1(int age,String name)  //3
    {
        this();
        System.out.println("parent class 2 arg constructor");
    }
}
public class ThisandSuperTest1 extends ThisSuper1{
    ThisandSuperTest1()  //2
    {
        super(22,"tdit");
        System.out.println("child class no arg constructor");
    }
    ThisandSuperTest1(int age,String name) //1
    {
        this();
        System.out.println("child class 2 arg constructor");
    }

    public static void main(String[] args) {
        ThisandSuperTest1 obj=new ThisandSuperTest1(11,"java");
    }
}
