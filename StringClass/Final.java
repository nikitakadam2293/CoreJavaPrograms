package StringClass;

public class Final {
    public int i;
    public final int  j=11;
    public static final int  k  =9;

   /* static
    {
        k=7;
    }*/
    Final()
    {
        //this.k=6;
    }
    public void fun()
    {
        i++;
       // j++;  cannot assign a value to final variable
        System.out.println(Final.k);
    }

    public static void main(String[] args) {

        Final o= new Final();
        o.fun();

    }
}
