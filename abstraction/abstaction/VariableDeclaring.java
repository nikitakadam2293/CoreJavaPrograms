package abstraction.abstaction;

class  Variable1
{

    void m1()
    {
        /*int a;
        System.out.println(a);*/
    }
}
public class VariableDeclaring extends Variable1{

    static int b;

    public static void main(String[] args) {

        System.out.println("b" +b);
        Variable1 obj = new Variable1();
        obj.m1();
    }

}
