package constuctor;
class A3
{
    public A3()
    {
        System.out.println("A3 Constructor");
    }
}

class B3 extends A3{
    B3()
    {
        System.out.println("B3 Constructor");
    }
}
class C3 extends A3{
    C3()
    {
        System.out.println("C3 Constructor");
    }
}



public class HierarchicalConstructor extends C3{
    public HierarchicalConstructor() {
        System.out.println("HierarchicalConstructor");
    }

    public static void main(String[] args) {
        HierarchicalConstructor obj=new HierarchicalConstructor();
    }

}
