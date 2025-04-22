package polymorphism.overriding;
////Return type must be same for both parent and child class methods.   -> Primitive data types
class Parent
{
    long add(int a , int b)
    {
        return a+b;
    }
}
public class OverrideRule3 extends  Parent {
    @Override
    long add(int a, int b) {
        return a + b + 10;
    }
}
class TestObj {
    TestObj show(int agge) {
        Object oo = new Object();
        TestObj tt = new TestObj();
        return tt;
    }

}