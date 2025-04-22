package constuctor;

class ThisSuper
{
    ThisSuper()  //3
    {
        this(22,"Program");
        System.out.println("parent class no arg constructor");
    }
    ThisSuper(int age,String name)  //4
    {
        System.out.println("parent class 2 ==arg constructor");
    }
}
public class ThisandSuperTest extends ThisSuper {
    ThisandSuperTest()  //1
    {
        this(11,"java");
        System.out.println("child class no arg constructor");
    }
    ThisandSuperTest(int age,String name)  //2
    {
        System.out.println("child class 2 arg constructor");
    }

    public static void main(String[] args) {
        ThisandSuperTest obj=new ThisandSuperTest();
    }
}
