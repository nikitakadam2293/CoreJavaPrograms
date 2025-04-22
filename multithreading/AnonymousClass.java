package multithreading;

interface Ax
{
    void test();

    void show();
}


public class AnonymousClass implements Ax {

    public void test()
    {
        System.out.println("Provide implementation of interface method ");
    }

    @Override
    public void show() {

    }

    public static void main(String[] args) {

        AnonymousClass obj = new AnonymousClass();
        obj.test();


    }
}

class TestImpl
{
    public static void main(String[] args) {

        Ax obj = new Ax()
        {
           public  void test()
            {
                System.out.println("Provide implementation of interface method in anonymous class ");
            }

            @Override
            public void show() {
                System.out.println("Anonymous show method ");
            }

        };
        obj.show();
        obj.test();
    }
}