package constuctor;

class Parent{
     Parent()
    {
        System.out.println("Parent constructor");
    }
}
public class PrivateConstructor extends Parent
{
    private PrivateConstructor()
    {

        System.out.println("private ");
    }

    public static void main(String[] args) {

        PrivateConstructor o = new PrivateConstructor();
    }
}
