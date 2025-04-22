package abstraction.abstaction;

interface A11
{
    void test1( int a);
}
interface A12
{
    void test1();
}

public class InterfaceScenario {
    void test1()
    {
        System.out.println("==");
    }

    void test1(int a)
    {
        System.out.println("==++");
    }

    public static void main(String[] args) {
        InterfaceScenario obj = new InterfaceScenario();
        obj.test1(3);

        obj.test1();




    }
}
