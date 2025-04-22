package polymorphism.methodoverloading;

public class PrivateMethodOverloading {
    //overloadind - changing access spcifier

    private void add()
    {
        System.out.println("First  ");
    }

    public void add(int a)
    {
        System.out.println("Second  ");
    }

    public static void main(String[] args) {
        PrivateMethodOverloading obj = new PrivateMethodOverloading();
        obj.add();
        obj.add(2);

    }
}
