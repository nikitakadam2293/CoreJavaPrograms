package StringClass;

public class InternStringMethod {


    public static void main(String[] args) {
        String s1="Hello1";
        String s2="Hello2";
        String s3= new String("Hello");

        System.out.println(s1==s2);// false
        System.out.println(s1==s3);//  false

        String s4= s3.intern();
        System.out.println(s1==s4);  //false

        String s5="Hello";
        System.out.println(s4==s5);  //true


    }
}
