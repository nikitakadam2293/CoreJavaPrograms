package StringClass;

class Finalize1
{
    public int arr[];
    Finalize1( int size)
    {
        System.out.println(" Allocating the resource in constructor");
       this. arr= new int[size];
    }
    protected void finalize()
    {
        System.out.println(" Finalize method");
        this.arr=null;



    }

}
public class FinalizeMethodOfObject {
    public static void main(String[] args) {
        Finalize1 obj= new Finalize1(11);
        obj=null;  // if we can not give this statement  finalize not work
        System.gc();
    }
}
