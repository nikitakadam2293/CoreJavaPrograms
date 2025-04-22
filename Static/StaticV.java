package Static;

class Aj
{
    Aj()
    {
        System.out.println("parent constructor");
    }
}
public class StaticV extends Aj{
    {
        System.out.println("child instance block");
    }
    StaticV()
    {
        System.out.println("child constructor");
    }

    public static void main(String[] args) {
        StaticV obj =new StaticV();
    }
}
/*
* In Java, instance blocks (also known as instance initializer blocks)
* are executed automatically when an object of the class is created. These blocks are
* invoked as part of the object creation process, right after the constructor of the superclass
*  is called and before the constructor of the current class is executed.*/
