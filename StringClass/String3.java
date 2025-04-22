package StringClass;

public class String3 {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "Hello";
        String s3=new String("Hello");

        System.out.println(" =="+s1.equals(s3));  //true

        String s4=" hi";

        s3="kadam";
        System.out.println(s2.equals(s3));  // false

       /* s2=" hi";
        System.out.println(s1==s2);  //false*/

       /*  System.out.println( s1==s2);  //true  due to string literal
        System.out.println(s1==s3);   //false  s1 in string literal and s2 in heap reference are
        // different

        System.out.println("=======");
        System.out.println(s1.equals(s2));      //true
        System.out.println(s2.equals(s3));      //true

        System.out.println(s2.equals(s4));  //false
        System.out.println(s2==s4);         //false*/


    }
}
