package StringClass;

public class StringEquals {

    public static void main(String[] args) {
        String s1= new String("Java");
        String s2= new String("Java");

        String t1="Java";
        String t2="Java";

        boolean b1=s1.equals(s2);
        System.out.println(b1);  // true

        boolean b2=t1.equals(t2);
        System.out.println(b2);  //true

        boolean b3=t1.equals(s2);
        System.out.println(b3);  //true


        boolean b4=t1.equals(s2);
        System.out.println(b4);  // true
    }
}
