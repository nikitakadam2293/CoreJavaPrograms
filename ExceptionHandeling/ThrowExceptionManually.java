package ExceptionHandeling;

public class ThrowExceptionManually {
    public static void main(String[] args) {
        try
        {
            ArithmeticException a = new ArithmeticException("Exception occure");

            throw a;

        }
        catch (ArithmeticException  ae)
        {
            System.out.println("Arithmetic Exception caught : " + ae);
            System.out.println(ae.getMessage());
        }
    }
}
