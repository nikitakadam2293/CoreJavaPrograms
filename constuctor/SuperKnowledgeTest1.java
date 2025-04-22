package constuctor;

class SuperAx
{
    SuperAx()
    {
        System.out.println("SuperAx no arg constructor");
    }
    SuperAx(int a)  //3
    {
        System.out.println("SuperAx 1 arg constructor"); //
    }
}
class SuperBx extends SuperAx
{
    int a1=11;
    String b= "xxxx";
    SuperBx()  //2
    {
        super(11);
        System.out.println("SuperBx no arg constructor"); //
    }
    SuperBx(int a, String b)
    {
        this.a1=a;
        this.b="yyyy";
        System.out.println("SuperBx 2 arg constructor");

    }
    void superBx()
    {
        System.out.println("SuperBx method");
    }
}
public class SuperKnowledgeTest1  extends SuperBx{
    SuperKnowledgeTest1()
    {
        System.out.println("SuperKnowledgeTest no arg constructor");  //
    }
    SuperKnowledgeTest1(int a, String b,boolean t)
    {
        System.out.println("SuperKnowledgeTest 3 arg constructor");
    }
    public void fun()
    {
        System.out.println( "fun "+super.a1); //11
        super.superBx();
    }

    public static void main(String[] args) {
        //SuperKnowledgeTest1 obj=new SuperKnowledgeTest1(1002,"program",false);
       // SuperKnowledgeTest1 obj=new SuperKnowledgeTest1();
       // SuperBx s =new SuperBx();
       SuperBx s1 =new SuperBx(11,"SuperBx");
        //obj.fun();
    }
}
