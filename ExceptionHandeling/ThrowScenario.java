package ExceptionHandeling;

public class ThrowScenario {
    public static void main(String[] args) {
        int x= 20;
        int y=0;

        try
        {
            int z = x/y;
            throw new ArithmeticException();

            //System.out.println("z is : "+z);  //java: unreachable statement

        }
        catch (ArithmeticException ae)
        {
            System.out.println("Exception caught : "+ae);
        }
    }
}
