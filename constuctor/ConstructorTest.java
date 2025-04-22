package constuctor;

public class ConstructorTest {
    int age;
    String name ;
    float marks;
    char c;
    boolean a;
    byte b;

     void dummy()
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ConstructorTest oo = new ConstructorTest();
        System.out.println(oo.age); //100
        System.out.println(oo.name);//java
        System.out.println(oo.marks);//java
        System.out.println("char"+oo.c);//java
        System.out.println(oo.a);//java
        System.out.println(oo.b);//java


        // ConstructorTest.dummy();
    }
}
