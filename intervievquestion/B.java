package intervievquestion;

class A
{


}

class B extends A
{

    public static void main(String arg[])
    {

        A obj = new B(); // upcasting

        B bobj =(B) new A(); //

        short a =10;
        int b = a;

        long c =2222;
        int d = (int) c;


    }
}