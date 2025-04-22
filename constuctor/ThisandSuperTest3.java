package constuctor;

class SuperTest11
{
    public SuperTest11() //9
    {
        System.out.println("This is  No arg SuperTest11 Constructor");
    }
    public SuperTest11(int age,boolean q)   //7
    {
        this("abc");
        System.out.println("This is 2 arg SuperTest11 Constructor");
    }
    public SuperTest11(String name)  //8
     {
         this();

        System.out.println("This is 1 arg SuperTest11 Constructor");
    }
}
class SuperTest222 extends SuperTest11
{
    public SuperTest222()   //6
    {
        super(11,false);
        System.out.println("This is  No arg SuperTest222 Constructor");
    }
    public SuperTest222(int age,boolean q)  //4
    {
        this("java");
        System.out.println("This is 2 SuperTest222 Constructor");
    }
    public SuperTest222(String name) //5
    {
        this();

        System.out.println("This is 1 arg SuperTest222 Constructor");
    }
}
class SuperTest333 extends SuperTest222
{
    public SuperTest333()  //3
    {
        super(11,true);
        System.out.println("This is  No arg SuperTest333 Constructor");
    }
    public SuperTest333(int age,boolean q) //1
    {
        this("java");
        System.out.println("This is 2 SuperTest333 Constructor");
    }
    public SuperTest333(String  name ) //2
    {
        this();
        System.out.println("This is 1 arg SuperTest333 Constructor");
    }
}
public class ThisandSuperTest3 extends SuperTest333 {
    public static void main(String[] args) {
        SuperTest333 obj = new SuperTest333(11,true);

    }
}
