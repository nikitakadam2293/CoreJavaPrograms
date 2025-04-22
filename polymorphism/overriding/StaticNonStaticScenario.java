package polymorphism.overriding;

class  Parent1
{
    int a=10;
    static int b=11;

    static void m1()
    {
        System.out.println("Parent1 static method m1");
    }

    void m2()
    {
        System.out.println("Parent1  non static method m2");

    }
}
public class StaticNonStaticScenario extends Parent1  {

    int a=21;
    static int b=22;

    static void m1()
    {
        System.out.println("Child static method m1");
    }

    void m2()
    {
        System.out.println("Child  non static method m2");

    }

    public static void main(String[] args) {
       /* Parent1 obj = new Parent1();
        obj.m1(); //Parent1 static method m1

        obj.m2();  //Parent1  non static method m2

        System.out.println(obj.a);  //10
        System.out.println(obj.b);  //11*/


        Parent1 obj1 = new StaticNonStaticScenario();
        obj1.m1();  //Parent1 static method m1

        obj1.m2();  //Child  non static method m2


        System.out.println(obj1.a);  //10
        System.out.println(obj1.b);  //11



        /*StaticNonStaticScenario obj3 = new StaticNonStaticScenario();
        obj3.m1();  //Child static method m1

        obj3.m2();   //Child  non static method m2

        System.out.println(obj3.a);  //21
        System.out.println(obj3.b);  //22*/



    }

}
