package java8programming.lambdaexpression;

interface  ExceptionThrowandThrows11
{

    void show(int a, int b) throws Exception;
}

public class ExceptionThrowAndThrows {
    public static void main(String[] args) {

        ExceptionThrowandThrows11 exceptionThrowandThrows = (i,j)-> {

            if(j==0)
            {
                throw new ArithmeticException("======== Arithmetic exception occure");
            }
            int c = i/j;
            System.out.println("Result : " + c);
        };

        try
        {
            exceptionThrowandThrows.show(10,0);
        }
        catch (Exception e)
        {
            System.out.println("Exception : " + e);
        }

    }
}
