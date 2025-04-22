package java8programming.functionalinteraface;

interface StaticSce
{
   static void test()
    {
        System.out.println("Parent Static Method");
    }
}
public class StaticMethodScenario implements StaticSce
{
    static void test()
    {
        System.out.println("Child Static Method");
    }
    public static void main(String[] args) {

        StaticSce.test();
    }
}
