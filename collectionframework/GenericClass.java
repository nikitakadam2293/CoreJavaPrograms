package collectionframework;

 class GenericClass1<T> {

    //  // variable of T type
    private T data;

    GenericClass1(T data)
    {
        this.data=data;
    }

     // method that return T type variable
    public T getData()
    {
        return this.data;
    }

}

public class GenericClass
{
    public static void main(String[] args) {

        GenericClass1<Integer> obj = new GenericClass1<>(5);
        System.out.println("Integer : " +obj.getData());

        GenericClass1<String> obj1 = new GenericClass1<>("java");
        System.out.println("String : " +obj1.getData());

    }




}
