package abstraction.abstaction;

abstract class  Ax
{
    abstract void show();
}
abstract class B extends Ax
{
    abstract void show();

}
abstract class C extends Ax
{

}
/*class C extends A,B
{

}*/
public class MultipleAbstaction extends B{
    public static void main(String[] args) {

    }

    @Override
    void show() {
    }
}
