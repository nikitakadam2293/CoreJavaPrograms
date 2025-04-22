package constuctor;

class SuperTest1
{
    public SuperTest1() {
        System.out.println("This is  No arg SuperTest1 Constructor");
    }
    public SuperTest1(int age,boolean q)   //8
    {
        this();
        System.out.println("This is 2 argSuperTest1 Constructor");
    }
    public SuperTest1(String name)  //7
     {
         this(33,false);
        System.out.println("This is 1 arg SuperTest1 Constructor");
    }
}
class SuperTest22 extends SuperTest1
{
    public SuperTest22()   //6
    {
        super("SuperTest1");
        System.out.println("This is  No arg SuperTest22 Constructor");
    }
    public SuperTest22(int age,boolean q)  //5
    {
        this();
        System.out.println("This is 2 SuperTest22 Constructor");
    }
    public SuperTest22(String name) //4
    {
        this(22,false);
        System.out.println("This is 1 arg SuperTest22 Constructor");
    }
}
class SuperTest33 extends SuperTest22
{
    public SuperTest33()  //3
    {
        super("SuperTest22");
        System.out.println("This is  No arg SuperTest33 Constructor");
    }
    public SuperTest33(int age,boolean q) //2
    {
        this();
        System.out.println("This is 2 SuperTest33 Constructor");
    }
    public SuperTest33(String  name ) //1
    {
        this(11,true);
        System.out.println("This is 1 arg SuperTest33 Constructor");
    }
}
public class ThisandSuperTest2 extends SuperTest33 {
    public static void main(String[] args) {
        SuperTest33 obj = new SuperTest33("java");

    }
}
