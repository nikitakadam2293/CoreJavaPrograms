package abstraction.abstaction;
/*
* if one abstract class implements one or more interfaces,then its not
* mandatory for that child class to provide
* method implementation of abstract method of interface */

interface A1
{
    void test();
}
interface A2
{
    void dummy();
}
abstract class InterfaceRule4AbstractClass implements A1,A2
{
   public void test()
    {
        System.out.println("implement test method of interface A1");
    }

}
public class InrefaceRule4 {
}
