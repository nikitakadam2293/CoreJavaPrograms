package constuctor;

class Parent1
{
    int a=122;
}

public class SuperScebnario extends Parent1 {
    int a=11;
    void hello()
    {
        /*System.out.println(super.a);
        System.out.println("a "+a);
        System.out.println("this "+a);*/

    }

    public static void main(String[] args) {

        /*SuperScebnario obj = new SuperScebnario();
        obj.hello();*/

        Parent1 o = new Parent1();
        System.out.println(o.a);
    }
}
