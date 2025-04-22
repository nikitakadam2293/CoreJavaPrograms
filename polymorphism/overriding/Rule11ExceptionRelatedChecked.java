package polymorphism.overriding;

class ParentClass1
{
    void m1() throws ClassNotFoundException
    {
      throw  new ClassNotFoundException();  //Allowed
    }
}

public class Rule11ExceptionRelatedChecked extends ParentClass1
{
    void m1() throws ClassNotFoundException
    {
        throw  new ClassNotFoundException();
    }

    public static void main(String[] args) {


        ParentClass1 o = new Rule11ExceptionRelatedChecked();

    }
}
