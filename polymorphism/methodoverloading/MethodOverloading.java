package polymorphism.methodoverloading;

public class MethodOverloading {

    //return type different

    public void add(int q , int a)
    {
        System.out.println("First add function");
    }
    public int  add(int q )
    {
        System.out.println("Second add function");
        return 0;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        //obj.add(11);
        obj.add(11,22);
        obj.add(11);



    }

}
