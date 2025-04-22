package abstraction.abstaction;

abstract class Aa
{
    Aa(int a)
    {
        System.out.println("Abstract class Aa constructor" + a);
    }
}
class Ba extends Aa
{
 Ba(){
     super(11);
    //System.out.println("Abstract class Ba constructor" +a);
}
void show()
{
    //System.out.println(a);
}
}
public class ContructorUseInAbstract {
    public static void main(String[] args) {
        Ba obj=new Ba();
    }

}
