package StringClass;

public class StringCompareUsingOperator {
    public static void main(String[] args) {
        String s1= new String("Java");
        String s2= new String("Java");

        String t1="Java";
        String t2="Java";

        boolean b1=(s1==s2);
        System.out.println(b1);  // false

        boolean b2=(t1==t2);
        System.out.println(b2);  //true

        boolean b3=(t1==s2);
        System.out.println(b3);  //false


        boolean b4=(t1==s2);
        System.out.println(b4);  //false

    }
}
