package ExceptionHandeling;

public class Throw4 {
    public static void main(String[] args) {
        try
        {
            m1();

        }
        catch (ArithmeticException e)
        {
            System.out.println("main  ArithmeticException ");
        }
    }
    static void m1()
    {
        try
        {
            int a[] = {1,23,3,3};
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException ee)
        {
            System.out.println("Array Index Out Of Bound Exception " + ee);
            throw new ArithmeticException();
        }
    }
}
/*
Array Index Out Of Bound Exception java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
main  ArithmeticException
* */