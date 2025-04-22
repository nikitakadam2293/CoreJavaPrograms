package polymorphism.overriding;
////Wedding Card   => Parent name  => Child
class ParentCovarient
{
     ParentCovarient show()
     {
         ParentCovarient parent = new ParentCovarient();
         return parent;

     }
    ParentCovarient test()
    {
        ParentCovarient parent = new ParentCovarient();
        return parent;
    }
}
public class CovariantReturnTypes extends ParentCovarient {
    @Override
    ParentCovarient show()
    {
        ParentCovarient parentInChild = new ParentCovarient();
        return parentInChild;
    }

   // @Override
    CovariantReturnTypes test()
    {
        CovariantReturnTypes child=new CovariantReturnTypes();
        return child;
    }

    public static void main(String[] args) {

    }
}
