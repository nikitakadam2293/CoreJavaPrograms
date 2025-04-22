package Static;
class AStatic
{
    static
    {
      /* static void mun();
        {

        }*/
        sun();
        //gun();
    }
     static void sun()
    {
        System.out.println("Astatic sun");
    }
    void gun()
    {
        System.out.println("Astatic sun");
    }
    //sun();
}
public class CanstaticMethodOverrideChildclass extends AStatic {
    public static void main(String[] args) {
        CanstaticMethodOverrideChildclass o = new CanstaticMethodOverrideChildclass();
        o.sun();
       /* static void xx()
        {

        }*/

        /*static void sun()
        {
            System.out.println("child static");
        }*/
    }
}
