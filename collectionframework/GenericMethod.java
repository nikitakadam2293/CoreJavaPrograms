package collectionframework;

import java.util.List;

class Demo
{
    public <T> void genericMethod(T data)
    {
        System.out.println("Generic Method");
        System.out.println("Data : " +data);
    }
}
public class GenericMethod
{
    public static void main(String[] args) {

        Demo obj = new Demo();


        obj.genericMethod("java");

        obj.genericMethod(22);

       /* obj.<String>genericMethod("java");   //allow

        obj.<Integer>genericMethod(22);   //allow
        */


    }

}
