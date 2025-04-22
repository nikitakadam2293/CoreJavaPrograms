package abstraction.abstaction;
interface C1
{
    void test();
}
interface C2
{
    void show();
}
abstract class C3
{
   abstract void dummy();
}
public class AbstractPlusInterface extends C3 implements C1,C2 {
    @Override
    public void test() {

    }
    @Override
    void dummy() {

    }
    @Override
    public void show() {

    }


}
