package constuctor;

public class Constuctor1 {
    int x;
    int y;
    Constuctor1(int a,int b)
    {
        this.x=99;
        this.y=88;

    }

    public static void main(String[] args) {
        Constuctor1 c=new Constuctor1(11,21);
        System.out.println(c.x );
        System.out.println(c.y);
    }
   /* class A
    {
        public static void main(String[] args) {
            System.out.println("Second");
        }
    }*/
}
