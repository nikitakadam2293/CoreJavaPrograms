package ExceptionHandeling;

public class MethodStackExample {
    void m1()
    {
        System.out.println("Inside m1 method");
        m2();
    }
    void m2()
    {
        System.out.println("Inside m2 method");
        m3();
    }
    void m3()
    {

        System.out.println("Inside m3 method");
    }
    public static void main(String[] args) {
        MethodStackExample obj = new MethodStackExample();
        obj.m1();

    }
}
