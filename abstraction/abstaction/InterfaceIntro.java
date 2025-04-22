package abstraction.abstaction;

interface TestInterface
{
    //by default methods in interface are abstract
    abstract void test();
}


interface ABCD extends TestInterface,XYZ
{
    //abstract void test();
}
interface XYZ
{
    abstract void test();

}
 class TestAbstractClass implements  TestInterface,ABCD,XYZ
{
    public void test()
    {
        System.out.println("--");

    }


}
public class InterfaceIntro {
    public static void main(String[] args) {

    }
}
