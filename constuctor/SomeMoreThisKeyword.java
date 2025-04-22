package constuctor;
//        System.out.println("No arg constructor");
//        System.out.println("3 arg constructor");
//        System.out.println("2 arg constructor");
//        System.out.println("2 arg constructor");
public class SomeMoreThisKeyword {
    SomeMoreThisKeyword(String name, boolean b)   //2
    {
        this(false, 11111,11);
        System.out.println("2 arg constructor");
    }
    SomeMoreThisKeyword(boolean m, long salary,int age)  //3
    {
        this();
        System.out.println("3 arg constructor");
    }
    SomeMoreThisKeyword(int a, long b)
    {
        this("java", false);   ///1
        System.out.println("2 arg constructor");
    }
    SomeMoreThisKeyword()  //4
    {
        System.out.println("No arg constructor");
    }

    public static void main(String[] args) {
        SomeMoreThisKeyword obj=new SomeMoreThisKeyword(11,1111);

    }
}
