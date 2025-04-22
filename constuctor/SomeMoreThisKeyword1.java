package constuctor;
//        System.out.println("No arg constructor");
//        System.out.println("3 arg constructor");
//        System.out.println("2 arg constructor");
//        System.out.println("1 arg constructor");
public class SomeMoreThisKeyword1 {
    SomeMoreThisKeyword1(String name)   //1
    {
        this(11,1111);
        System.out.println("1 arg constructor");
    }
    SomeMoreThisKeyword1(boolean m, long salary,int age)  //3
    {
        this();
        System.out.println("3 arg constructor");
    }
    SomeMoreThisKeyword1(int a, long b)  //2
    {
        this(false,1111,11);
        System.out.println("2 arg constructor");
    }
    SomeMoreThisKeyword1()   //4
    {
        System.out.println("No arg constructor");
    }

    public static void main(String[] args) {
        SomeMoreThisKeyword1 obj=new SomeMoreThisKeyword1("java");

    }
}
