package polymorphism.overriding;

class Demo
{
    public int arr[];
    public Demo (int size)
    {
        System.out.println("Allocating the resourse in constructor");
        this.arr = new int[size];

    }
    @Override
    protected void finalize()
    {
        System.out.println("Deallocate the Resourse");
        this.arr=null;

    }
}

public class ObjectFinalizeMethod {


    public static void main(String[] args) {
        Demo obj = new Demo(11);

        obj=null;
        System.gc();
        System.out.println( "  end main ");
    }

}
