package java8programming.functionalinteraface;

interface  StaticDefault
{
    default void test()
    {
        System.out.println("Default Method ");
    }
    static void show()
    {

        System.out.println("Static method ");
    }
}
public class DefaultVsStaticMethod implements StaticDefault
{
    @Override
    public void test()
    {
        System.out.println("Override  Default Method of interface");
    }

    public static void main(String[] args) {

        StaticDefault.show();

        StaticDefault o = new DefaultVsStaticMethod();
        o.test();

    }
}
