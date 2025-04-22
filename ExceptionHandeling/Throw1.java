package ExceptionHandeling;

public class Throw1 {
    void test()
    {
        throw new ArithmeticException("Arithmetic Exception");  //Runtime
    }

    public static void main(String[] args) {

        Throw1 obj = new Throw1();
        try {
            obj.test();
            System.out.println("try");
        }
        catch (ArithmeticException e)
        {
            System.out.println("ex of "+e);
        }

    }
}
