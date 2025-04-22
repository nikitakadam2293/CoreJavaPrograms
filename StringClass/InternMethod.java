package StringClass;

public class InternMethod {
    public static void main(String[] args) {
        //Write a Java program to get the Canonical representation of the string object.

        // intern for String
        String s6 = "Java Exersise";
        String s7 =new String("Java ").concat("Exersise");   // new StringBuffer("Java").append("Exersise").toString();
        String s8= s7.intern();

        System.out.println( s6 == s8);  //true
        System.out.println( s7 == s8);   //false
        System.out.println(s6==s7);   //false

      /*  // intern for String Buffer

        String s6= "Java Exersise";
        String s7= new StringBuffer( "Java ").append("Exersise").toString();

        String s8 =s7.intern();

        System.out.println(s6==s8);  //true
        System.out.println(s7==s8);  //false
        System.out.println(s6==s7);  //false

*/



        /*
        * false
            true*/
    }
}
