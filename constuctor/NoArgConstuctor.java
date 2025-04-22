package constuctor;

class Parent6
{
   /* Parent6()
    {

    }*/
}
public class NoArgConstuctor extends Parent6{

    NoArgConstuctor()
    {
        System.out.println("Hello");
    }
    NoArgConstuctor(String s)
    {
        System.out.println("String");
    }
    public static void main(String[] args) {

        NoArgConstuctor o = new NoArgConstuctor();
        NoArgConstuctor o1 = new NoArgConstuctor("oooo");

    }
}
