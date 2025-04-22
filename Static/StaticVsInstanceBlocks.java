package Static;

public class StaticVsInstanceBlocks {
    int a = 100;   //
    static int b = 200; //

    static {
        System.out.println("This is static block");
    }

    {
        System.out.println("This is instance block");
    }
}

/*
package Static;

public class StaticVsInstanceBlocks {
    int a;
    static int b=200;

    static{
        System.out.println("This is a static block");
    }
    {
        a=10;
        System.out.println("This is a instance Block" +a);
    }
    //
    public static void main(String[] args) {

        StaticVsInstanceBlocks obj= new StaticVsInstanceBlocks();
        StaticVsInstanceBlocks obj1= new StaticVsInstanceBlocks();

        System.out.println("fun");
        System.out.println(obj.a);
    }
}
*/

/*
* output
* This is a static block
This is a instance Block10
This is a instance Block10
fun
10*/
