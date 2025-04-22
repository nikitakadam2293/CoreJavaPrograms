package ExceptionHandeling;

public class CustomTryWithResoure implements AutoCloseable
{
    void test()
    {
        System.out.println("Test method call");
    }

    public static void main(String[] args) {

        try(CustomTryWithResoure obj = new CustomTryWithResoure())
        {
            CustomTryWithResoure obj2 = null;
            obj2.test();

            obj.test();
        }
        catch (Exception e)
        {
            System.out.println("Got into catch block");
        }

    }

    @Override
    public void close() throws Exception {
        System.out.println("will this code gets executed??");
    }
}
/*
first close method output print then catch block

will this code gets executed??
Got into catch block
* */