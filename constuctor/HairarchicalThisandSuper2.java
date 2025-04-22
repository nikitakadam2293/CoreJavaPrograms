package constuctor;

class AHaerarchical2
{
    AHaerarchical2()
    {

        System.out.println(" No AHaerarchical2 constructor");
    }
    AHaerarchical2(String a)
    {
        System.out.println(" 1 arg AHaerarchical2 constructor");
    }
    AHaerarchical2(String a,int ag)
    {
        System.out.println(" 2 arg AHaerarchical2 constructor");
    }
}
class BHaerarchical2 extends AHaerarchical2
{

}
class CHaerarchical2 extends AHaerarchical2
{
    CHaerarchical2()
    {
        System.out.println(" No CHaerarchical2 constructor");
    }
    CHaerarchical2(int a)
    {
        super("aaa");
        System.out.println(" 1 arg CHaerarchical2 constructor");
    }
    CHaerarchical2(int a,boolean d)
    {
        super("aaa",222);
        System.out.println(" 2 arg CHaerarchical2 constructor");
    }


}
public class HairarchicalThisandSuper2 extends CHaerarchical2{
    HairarchicalThisandSuper2()
    {
        System.out.println(" No HairarchicalThisandSuper2 constructor");
    }

    HairarchicalThisandSuper2( String a)
    {
        super(11);

        System.out.println(" 1 arg HairarchicalThisandSuper2 constructor");
    }
    HairarchicalThisandSuper2( String a , float f)
    {
        super(11,false);

        System.out.println(" 2 arg HairarchicalThisandSuper2 constructor");
    }
    public static void main(String[] args) {
        HairarchicalThisandSuper2 obj=new HairarchicalThisandSuper2();
        HairarchicalThisandSuper2 obj1=new HairarchicalThisandSuper2("aaa");
        HairarchicalThisandSuper2 obj2=new HairarchicalThisandSuper2("aaa" , 1);



    }
}
/*
output=
HairarchicalThisandSuper2 obj=new HairarchicalThisandSuper2();
        HairarchicalThisandSuper2 obj1=new HairarchicalThisandSuper2("aaa");

* No AHaerarchical2 constructor
 No CHaerarchical2 constructor
 No HairarchicalThisandSuper2 constructor
 1 arg AHaerarchical2 constructor
 1 arg CHaerarchical2 constructor
 1 arg HairarchicalThisandSuper2 constructor*/