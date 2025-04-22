package polymorphism.overriding;

@FunctionalInterface
 interface MyFunctionalInterface1 {
    void execute();
    //void execute1();


    // You can still have default methods in a functional interface
    default void printMessage(String message) {
        System.out.println(message);
    }

    // Static methods are also allowed
    static void printStaticMessage(String message) {
        System.out.println("Static: " + message);
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface1 myFunc = () -> System.out.println("Executing...");
        myFunc.execute();
        myFunc.printMessage("Hello from default method!");

        // Calling the static method
        MyFunctionalInterface1.printStaticMessage("Hello from static method!");
    }
}

