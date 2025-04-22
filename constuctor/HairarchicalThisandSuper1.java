package constuctor;

class AHaerarchical1
{
    AHaerarchical1()
    {
        System.out.println(" No AHaerarchical1 constructor");
    }
    AHaerarchical1(String a)
    {
        this();
        System.out.println(" 1 arg AHaerarchical1 constructor");
    }
}
class BHaerarchical1 extends AHaerarchical1
{

}
class CHaerarchical1 extends AHaerarchical1
{
    CHaerarchical1()
    {
        super("kkkk");
        System.out.println(" No CHaerarchical1 constructor");
    }
    CHaerarchical1(int a)
    {
        this();
        System.out.println(" 1 arg CHaerarchical1 constructor");
    }

}
public class HairarchicalThisandSuper1 extends CHaerarchical1{
    HairarchicalThisandSuper1()
    {
        super(1);
        System.out.println(" No HairarchicalThisandSuper1 constructor");
    }

    HairarchicalThisandSuper1( String a)
    {
        this();
        System.out.println(" 1 arg HairarchicalThisandSuper1 constructor");
    }
    public static void main(String[] args) {
        HairarchicalThisandSuper1 obj=new HairarchicalThisandSuper1("aaaa");
    }
}
