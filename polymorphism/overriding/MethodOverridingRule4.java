package polymorphism.overriding;
////4) The access level cannot be more restrictive than the parent class method’s access level.

class Rule4Parent
{
    public  void show()
    {
        System.out.println("Parent class method is having public access modifier");
    }
}
public class MethodOverridingRule4 extends Rule4Parent{
    @Override
      public void show()
    {
        System.out.println("Child class method is having public access modifier");

    }

    public static void main(String[] args) {

    }

}
