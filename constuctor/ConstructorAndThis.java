package constuctor;

class Demo
{
    String a;
    Demo( String b)
    {
      this.a=b;
    }
}
public class ConstructorAndThis extends Demo{
    String aa;
    ConstructorAndThis()
    {
        super("abcd");
    }
    public static void main(String[] args) {

    }
}
