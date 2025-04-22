package StringClass;

class  ABC
{
    int x=30;
}
public class ShallowCopy {
    public static void main(String[] args) {
       /*
        // shallow copy ==========
        ABC obj1= new ABC();
        ABC obj2=obj1;
        obj2.x=6;
        System.out.println("Value of x is: "+obj1.x);  // 6 //shallo copy

        ///============*/


        ABC obj1= new ABC();
        ABC obj2= new ABC();
        obj2.x=6;
        System.out.println("value of xis :"+ obj1.x);  //value of xis :30

    }
}
