package abstraction.abstaction;
/*
* if concrete/ non abstract class  implements  one or more interface ,
* then its manadatory for that child class to provide method
* implentation for abstract methods of interface*/
interface B1
{
    void test();
}
interface B2
{
    void dummy();
}
public class InterfaceRule5 implements B1,B2{

    @Override
    public void test() {

    }

    @Override
    public void dummy() {

    }
}
