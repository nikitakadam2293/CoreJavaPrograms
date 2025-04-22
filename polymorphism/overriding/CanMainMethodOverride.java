package polymorphism.overriding;

class Demo8
{
    public static void main(String[] args) {

        System.out.println("Parent");
    }
}


public class CanMainMethodOverride extends Demo8 {
    public static void main(String[] args) {

        System.out.println("child");

    }
}
/*
* main method cannot be overridden (because it's static).

It can be hidden by declaring a main method in a subclass. (Method Hiding)
* */