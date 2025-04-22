package abstraction.abstaction;

 abstract class GPAbstract
{
     abstract void show();
    void dummy()
    {
        System.out.println("No abstact method in GP");
    }

}
abstract class ParentAbstract extends GPAbstract
{
    abstract int addition();
    abstract int substraction();
}
abstract class ChildAbstract extends ParentAbstract
{

}
public class AbstractionMultilevel extends ChildAbstract {
    @Override
    void show() {

    }

    @Override
    int addition() {
        return 0;
    }

    @Override
    int substraction() {
        return 0;
    }
    public static void main(String[] args) {


        AbstractionMultilevel obj=new AbstractionMultilevel();
        obj.dummy();

    }

}
