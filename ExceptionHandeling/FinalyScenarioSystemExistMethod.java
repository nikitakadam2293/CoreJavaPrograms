package ExceptionHandeling;

public class FinalyScenarioSystemExistMethod {

    // finally block not exicute if use System.exit(0); and b) When an exception happens in the finally block.
    public static void main(String[] args) {

        try
        {
            int c = 10/0;

        }
        catch(ArithmeticException e)
        {
            int d =22;
            System.out.println(" Exception ");
        }
        finally {

            int d =33;
            System.out.println("d:"+d);



            int z = 10/0;
            System.out.println("Finally block ");

        }
        /*finally {
            System.exit(0);
            System.out.println("Finally block ");
        }*/

    }



}
