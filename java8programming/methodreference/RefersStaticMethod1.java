package java8programming.methodreference;

@FunctionalInterface
interface  Demo
{
    void test();
}

class  Hello
{
    static void m1()
    {
        System.out.println("m1 method of Hello class ");
    }
}
public class RefersStaticMethod1 {

    public static void main(String[] args) {

        Demo demo =  Hello::m1;
        demo.test();

    }
}
