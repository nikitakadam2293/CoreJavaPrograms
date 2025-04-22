package ExceptionHandeling;

public class Throw3 {
    void test()
    {
        try
        {
            ArithmeticException e = new ArithmeticException("Arithmetic ex");
            throw e;
            //System.out.println("helo");  //java: unreachable statement(code could not be compiled.)
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception caught : "+ e);

            System.out.println(e.getMessage());  //Arithmetic ex

        }

    }

    public static void main(String[] args) {

        Throw3 o = new Throw3();
        o.test();
    }
}
//Arithmetic exception caught : java.lang.ArithmeticException: Arithmetic ex