package java8programming.functionalinteraface;

interface DefaultScenario
{

    default void test(int a)
    {
        System.out.println("Static Method " + a);
    }
}
public class DefaultMethodScenario implements DefaultScenario  {


    public void test(int a)
    {
        System.out.println("Overriding Static Method " + a);
    }

    public static void main(String[] args) {

        DefaultScenario o = new DefaultMethodScenario();
        o.test(11);
    }
}
