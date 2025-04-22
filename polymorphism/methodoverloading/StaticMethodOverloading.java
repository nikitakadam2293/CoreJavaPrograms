package polymorphism.methodoverloading;

public class StaticMethodOverloading {
    public static void fun()
    {
        System.out.println("Static fun first");
    }
     public static void fun(int a)
    {
        System.out.println("Static fun Second");
    }

    public static void main(String[] args) {
        StaticMethodOverloading obj = new StaticMethodOverloading();
        obj.fun();
        obj.fun(22);

        StaticMethodOverloading.fun();
        StaticMethodOverloading.fun(22);



    }

}
