package constuctor;
class A
{
    A()
    {
        System.out.println("A Constructor");
    }
}
class B extends A
{
    B()
    {
        System.out.println("B Constructor");
    }
}
class C extends B
{
    C()
    {
        System.out.println("C Constructor");
    }
}

public class MultilevelConstructor extends C {
    public MultilevelConstructor() {
        System.out.println("Multilevel Constructor");
    }

    public static void main(String[] args) {
        MultilevelConstructor c = new MultilevelConstructor();

    }
}
