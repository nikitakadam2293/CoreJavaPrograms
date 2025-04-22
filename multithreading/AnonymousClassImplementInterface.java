package multithreading;

interface Polygoan
{
    void display1();

    void dis();
}

class AnonymousDemo1 {
    void createClass()
    {

        Polygoan obj = new Polygoan() {
            @Override
            public void display1() {

                System.out.println("Inside Anonymous class ");
            }

            @Override
            public void dis()
            {
                System.out.println("hello");
            }
        };
        obj.display1();
        obj.dis();

    }
}
public class AnonymousClassImplementInterface {
    public static void main(String[] args) {

        AnonymousDemo1 obj = new AnonymousDemo1();
        obj.createClass();
    }
}
