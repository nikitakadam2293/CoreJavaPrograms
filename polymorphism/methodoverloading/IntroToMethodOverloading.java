package polymorphism.methodoverloading;

 /* Declaring same method name but with different parameter list in same class is called
            method overloading.*/

public class IntroToMethodOverloading {
    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return  a+b+c;
    }

    public static void main(String[] args) {
      /*  IntroToMethodOverloading o = new IntroToMethodOverloading();
        System.out.println(o.add(11,22));*/
    }
}
