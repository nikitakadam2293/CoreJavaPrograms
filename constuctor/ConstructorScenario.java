package constuctor;

class Z
{
Z(int a)
{
    System.out.println(""+ a);

}
}
class Y extends Z{
    public Y() {
        super(11);
        System.out.println("Y Constructor");
    }
}
class X extends Y{
    public X() {
        System.out.println("X Constructor");
    }
}


public class ConstructorScenario  extends  X{
    public ConstructorScenario() {
        System.out.println("ConstructorScenario");
    }

    public static void main(String[] args) {
        ConstructorScenario obj=new ConstructorScenario();
    }
}
