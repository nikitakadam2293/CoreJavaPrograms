package polymorphism.overriding;

class A
{
    @Deprecated
    public void n()
    {
        System.out.println("hello");
    }
}
public class DeprecatedAnotation {
    public static void main(String[] args) {
        A a= new A();
        a.n();
    }

}
