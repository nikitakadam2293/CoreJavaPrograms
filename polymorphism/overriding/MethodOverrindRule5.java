package polymorphism.overriding;
//5) A method declared final cannot be overridden.

class Rule5Parent
{
    void show()
    {
        System.out.println(" final method");
    //return "aa";
    }
}
public class MethodOverrindRule5 extends Rule5Parent{
      void show()
    {
        System.out.println(" final method MethodOverrindRule5 class");
        //return "aa";
    }

    public static void main(String[] args) {
        Rule5Parent o = new MethodOverrindRule5();
        o.show();
    }
}
