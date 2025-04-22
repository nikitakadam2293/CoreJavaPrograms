package StringClass;

final class  Parent
{
    //Parent();
    void show()
    {
        System.out.println(" Final2 class method");
    }
}
class Child
{
    Parent obj= new Parent();  // composition


}
public  class FinalClass   {

    public static void main(String[] args) {
        Child obj2 = new Child();
        obj2.obj.show();
    }


}
