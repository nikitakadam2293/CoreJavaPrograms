package ExceptionHandeling;

public class NesterdTryBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
           // int c= 10/0;

            try {
                System.out.println("Inner try block");

               // int d= 11/0;

            }
            catch(ArithmeticException ex)
                {
                    System.out.println("inner catch block");

                }

        }
        catch (Exception e)
        {
            System.out.println("outer catch block");

        }
    }
}
