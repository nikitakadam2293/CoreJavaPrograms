package polymorphism.methodoverloading;

public class FinalMethodOverloading {

    public final void sum()
    {
        System.out.println("First final method");
    }
    public final void sum(int a)
    {
        System.out.println("Second final method");
    }

    public static void main(String[] args)
    {
        FinalMethodOverloading obj = new FinalMethodOverloading();
        obj.sum();
        obj.sum(22);
    }
}
