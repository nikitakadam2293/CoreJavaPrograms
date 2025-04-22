package constuctor;

class SuperA
{
    SuperA()  //3
    {
        System.out.println("SuperA no arg constructor");
    }
    SuperA(int a)
    {
        System.out.println("SuperA 1 arg constructor");
    }
}
class SuperB extends SuperA
{
    SuperB()   //2
    {
        System.out.println("SuperB no arg constructor");
    }
    SuperB(int a, String b)
    {
        System.out.println("SuperB 2 arg constructor");  ////
    }
}
public class SuperKnowledgeTest  extends SuperB{
    SuperKnowledgeTest()
    {
        System.out.println("SuperKnowledgeTest no arg constructor");
    }
    SuperKnowledgeTest(int a, String b,boolean t)   //1
    {
        System.out.println("SuperKnowledgeTest 3 arg constructor");
    }

    public static void main(String[] args) {
        SuperKnowledgeTest obj=new SuperKnowledgeTest(1002,"program",false);
    }
}
