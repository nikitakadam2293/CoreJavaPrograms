package StringClass;

public class FinalizeMethodOfObject1 {
    private int id;
    FinalizeMethodOfObject1( int id)
    {
        this.id=id;
    }
    public void finalize()
    {
        if( id % 50==0)
        {
            System.out.println("Finakize method call" +id);
        }
    }

    public static void main(String[] args) {
        for (int i= 1; i< 1000; i++) {
            //new FinalizeMethodOfObject1(i);

        }
        System.gc();

    }
}
