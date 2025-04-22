package constuctor;
//        System.out.println("2 arg constructor");
//        System.out.println("1 arg constructor");
//        System.out.println("No arg constructor");
//        System.out.println("3 arg constructor");
public class SomeMoreThisKeyword2 {
    SomeMoreThisKeyword2(String name)   //3
    {
        this(11,1111);
        System.out.println("1 arg constructor");
    }
    SomeMoreThisKeyword2(boolean m, long salary,int age)  //1
    {
        this();
        System.out.println("3 arg constructor");
    }
    SomeMoreThisKeyword2(int a, long b)  //4
    {

        System.out.println("2 arg constructor");
    }
    SomeMoreThisKeyword2()   //2
    {
        this("java");
        System.out.println("No arg constructor");
    }

    public static void main(String[] args) {
        SomeMoreThisKeyword2 obj=new SomeMoreThisKeyword2(true,1111,11);

    }
}
