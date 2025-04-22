package constuctor;

class AHaerarchical
{
    AHaerarchical()
    {
        System.out.println("AHaerarchical constructor");
    }
    AHaerarchical(String a)
    {
       this();
        System.out.println(" 1 arg AHaerarchical constructor");
    }
}
class BHaerarchical extends AHaerarchical
{

}
class CHaerarchical extends AHaerarchical
{
    CHaerarchical()
    {
       super("aa");
        System.out.println("CHaerarchical constructor");
    }

}
public class HairarchicalThisandSuper extends CHaerarchical{
    HairarchicalThisandSuper()
    {
        System.out.println(" HairarchicalThisandSuper constructor");
    }
    public static void main(String[] args) {
        HairarchicalThisandSuper obj=new HairarchicalThisandSuper();


    }
}
