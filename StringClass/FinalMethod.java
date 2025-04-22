package StringClass;

class Final1
{
    final void show()
    {
        System.out.println("Final methods");
    }
}
public class FinalMethod extends Final1 {

   /*  void show()
    {
        System.out.println("Final methods");
    }
*/
    public static void main(String[] args) {
        FinalMethod obj= new FinalMethod();
        obj.show();
    }
}
