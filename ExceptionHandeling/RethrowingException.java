package ExceptionHandeling;

class A
{
    void m1()
    {
        try
        {
            String str = "java";
            char ch = str.charAt(6);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception");
            throw e;
        }
    }
}

public class RethrowingException {
    public static void main(String[] args) {

        A obj = new A();
        obj.m1();
        try
        {
            obj.m1();
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Rethrow Exception Caught Here : "+ e);
        }
    }
}
