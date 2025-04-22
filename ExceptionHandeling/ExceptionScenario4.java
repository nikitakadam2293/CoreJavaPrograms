package ExceptionHandeling;

public class ExceptionScenario4 {
    public static void main(String[] args) {
        try
        {
            m1();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception is another type recauhgt  " + e);
        }
    }
    static void m1()
    {
        try
        {
            int a []= {1,2,3,4,5,6};
            System.out.println(a[7]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index OutOfBoundsException " + e);
            throw new ArithmeticException("Hello");
        }
    }
}
