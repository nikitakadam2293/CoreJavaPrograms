package ExceptionHandeling;


class UserDefinedException1 extends Exception
{
    UserDefinedException1(String str)
    {
        super(str);
    }

}

public class UserDefineException2 {
    public static void main(String[] args)  {
        try
        {
            throw new UserDefinedException1("this is user defined exception");
        }
        catch (UserDefinedException1 e)
        {
            System.out.println("User defined exception");
            System.out.println(e.getMessage());
        }
    }
}
/*
User defined exception
this is user defined exception
* */
