package constuctor;

class Parent44
{
    Parent44()
    {
        System.out.println("parent");
    }
}

public class CanUseSuperAndThisInSameConstructor extends Parent44 {

    CanUseSuperAndThisInSameConstructor()
    {
        super();
        System.out.println("Constuctor ");

      //  this(1);

    }

    CanUseSuperAndThisInSameConstructor(int a)
    {

    }

    public static void main(String[] args) {
        CanUseSuperAndThisInSameConstructor o = new CanUseSuperAndThisInSameConstructor();
    }
}
