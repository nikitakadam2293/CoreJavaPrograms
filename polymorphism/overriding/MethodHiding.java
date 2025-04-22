package polymorphism.overriding;

class  Complex
{
    public static  void f1()
    {
        System.out.println("F1 method of Complex class");
    }

}
class  Sample extends Complex
{
    public  static void f1()
    {
        System.out.println("F1 method of Sample class");
    }

}
public class MethodHiding {
    public static void main(String[] args) {
        Complex obj= new Complex();
         obj.f1();

        Sample obj2=new Sample();
        obj2.f1();


        Complex obj3=new Sample();
        obj3.f1();

//        Sample obj4=new Complex();  // not allow

      /*  Sample obj4=(Sample) obj3;
        obj4.f1();*/



        // Complex.f1();

    }

}
