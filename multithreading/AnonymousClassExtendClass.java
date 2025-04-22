package multithreading;
class Polygon
{
    void display()
    {
        System.out.println("Inside polygoan class");
    }
}

class AnonymousDemo
{
    void creteAnonymous()
    {
        Polygon obj = new Polygon()
        {
            void display()
            {
                System.out.println("Inside Anonymous Class ");
            }
        };
        obj.display();
    }
}

public class AnonymousClassExtendClass {
    public static void main(String[] args) {

        AnonymousDemo obj1 = new AnonymousDemo();
        obj1.creteAnonymous();
    }
}
