package java8programming;

@FunctionalInterface
interface AA{
    void test();

    //void show(); // 10000 classes implementing AA  interface
    static void staticMethod()
    {
        System.out.println("This is static method ");
    }

    static void staticMethod11()
    {
        System.out.println("This is static method ");
    }
    static void staticMethod44()
    {
        System.out.println("This is static method ");
    }


    default void defaultMethod()
    {
        System.out.println("This is default method ");
    }

    default void defaultMethod1()
    {
        System.out.println("This is default method ");
    }
    default void defaultMethod2()
    {
        System.out.println("This is default method ");
    }
    default void defaultMethod3()
    {
        System.out.println("This is default method ");
    }



}

class AAImple implements AA{


    @Override
    public void test() {

    }
}
public class DefaultStaticMethod implements AA
{


    @Override
    public void test() {

    }
}
