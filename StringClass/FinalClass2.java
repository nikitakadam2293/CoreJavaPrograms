package StringClass;

public final class FinalClass2 {

   private int a;
    String s;
    FinalClass2()
    {
        this.a = 11;
        this.s=" abcd";
    }
    void show()
    {
        System.out.println(" hello");
    }

    public static void main(String[] args) {
        FinalClass2 obj= new FinalClass2();
        obj.show();
        System.out.println(obj.a);

    }

}
