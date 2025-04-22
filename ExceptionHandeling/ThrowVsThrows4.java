package ExceptionHandeling;

public class ThrowVsThrows4 {

    void test() throws ArithmeticException
    {
        System.out.println("test 1");


       //1) throw new ArithmeticException();  //runtime
        //System.out.println("test 2");

        //2)
        ArithmeticException e = new ArithmeticException();
        throw e;

    }

    public static void main(String[] args) {

        ThrowVsThrows4 o = new ThrowVsThrows4();
        o.test();
    }
}
