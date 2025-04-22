package polymorphism.methodoverloading;

 class FinalClass
{
        final void demo()
        {
            System.out.println("First demo");
        }
    final void demo(int a)
    {
        System.out.println("Second demo");
    }
}
public class FinalMethodOverriding extends FinalClass  {
    public static void main(String[] args) {
        FinalClass o = new FinalClass();
        o.demo();
        o.demo(2);
    }

}
