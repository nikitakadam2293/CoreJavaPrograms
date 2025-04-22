package constuctor;

class Ay
{
    public Ay()  //6
    {
        System.out.println("No arg Ay constructor");
    }
    public Ay(String name)   //5
    {
        this();
        System.out.println("1 arg Ay constructor");
    }
    public Ay(int a, String v) //  //4
    {
        this("abc");
        System.out.println("2 arg Ay constructor");
    }
}
class By extends Ay
{
    public By() {
        System.out.println("No arg By constructor");
    }
    public By(String name) {
        System.out.println("1 arg By constructor");
    }
    public By(int a, String v)
    {
        System.out.println("2 arg By constructor");
    }
}
class Cy extends Ay {
    public Cy()  //3
    {
        super(11, "11");
        System.out.println("No arg Cy constructor");
    }

    public Cy(String name)  //2
    {
        this();
        System.out.println("1 arg Cy constructor");
    }

    public Cy(int a, String v)   //1
    {
        this("name");
        System.out.println("2 arg Cy constructor");
    }

    public static void main(String[] args) {
        Cy c = new Cy(1, "aa");
    }
}

/*public class ThisAndSuperHierarchical extends Cy
{
    public static void main(String[] args) {
       // ThisAndSuperHierarchical obj=new ThisAndSuperHierarchical(11,"aa");
    }
}*/
