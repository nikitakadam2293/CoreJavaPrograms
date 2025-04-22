package ExceptionHandeling;

class UserDefinedException extends Exception
{
    UserDefinedException()
    {

    }

}

public class UserDefineException {
    public static void main(String[] args)  {
        try
        {
            throw new UserDefinedException();
        }
        catch (UserDefinedException e)
        {
            System.out.println("User defined exception");
            System.out.println(e.getMessage());
        }
    }
}
/*
User defined exception
null
* */