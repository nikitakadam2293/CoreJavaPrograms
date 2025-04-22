package polymorphism.methodoverloading;

// static method can not override # on other class
class StaticA
{
    static void show()
    {
        System.out.println("Parent class first");
    }
    static void show(int i)
    {
        System.out.println("Parent class second");
    }
}
public class CanStaticmethodOverload extends StaticA{
    static void show()
    {
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        CanStaticmethodOverload obj = new CanStaticmethodOverload();
        CanStaticmethodOverload.show();  // child class
        CanStaticmethodOverload.show(22);    //Parent class second
        StaticA.show();//Parent class first
    }
}
