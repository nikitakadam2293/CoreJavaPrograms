package polymorphism.overriding;


//Related Runtime Exception

/*
* an overriding method (child class) can throw any unchecked exceptions,
* regardless of the overridden method (parent class) throwing exceptions or not.*/

class ParentClass
{
    void  m1()   throws Exception
    {

        throw new Exception();  //compile time Ex

        // throw new NullPointerException();  //Allowed

      //  throw new Exception();

       /* try {
            throw new Exception();  //Directly  NotAllowed but use try catch it not show eror msg
        } catch (Exception e) {

        }*/

    }
}

public class Rule11ExceptionRelated  extends ParentClass{

    void m1()
    {

        throw new ArithmeticException() ;
    }

    public static void main(String[] args) throws Exception {

        ParentClass o = new Rule11ExceptionRelated();
       o.m1();

      /*  try
        {
            o.m1();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Ari Ex");
        }*/


    }
}
