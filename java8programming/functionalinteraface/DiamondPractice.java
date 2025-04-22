package java8programming.functionalinteraface;

interface Int1
{
    static void staticMethod ()
    {
        System.out.println("Int1 static Method ");
    }
    default void  defaultMethod()
    {
        System.out.println("Int1 default method ");
    }

     void hello();
}

interface Int2
{
    static void staticMethod ()
    {
        System.out.println("Int1 static Method ");
    }
    default void  defaultMethod()
    {
        System.out.println("Int1 default method ");
    }

    void hello();
}

public class DiamondPractice implements Int1 , Int2{
    public static void main(String[] args) {

    }

 /*   @Override
    public void defaultMethod() {
        Int1.super.defaultMethod();
    }*/

    @Override
    public void defaultMethod() {
       // Int1.super.defaultMethod();
    }

    @Override
    public void hello() {
        System.out.println("Hello Child");
    }
}
