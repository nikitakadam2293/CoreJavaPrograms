package polymorphism.overriding;
class Aa
{
    public void show1()
    {
        System.out.println("Show 1 in parent");

    }

   public void show3()
    {
        System.out.println("Show 3 in parent");

    }
  public void show2()
  {
      System.out.println("Show 1 in parent");

  }
}
class Bb extends Aa
{
   public void show1()
    {
        System.out.println("Show 1 in child");

    }
    public void show2()
    {
        System.out.println("Show 2 in child");

    }
}
public class WhyJavaNotSupportDowncasting {
    public static void main(String[] args) {

        Aa obj=new Bb();  //
/*
        obj.show1();   //Show 1 in child

        obj.show2();  //Show 2 in child

        obj.show3();  //Show 3 in parent
*/

      // Bb obj1=(Bb) new Aa();

        Bb obj1= (Bb) obj;
        obj1.show2(); //Show 2 in child

        obj1.show1();  //Show 1 in child

        obj1.show3();  //Show 3 in parent


    }

}
