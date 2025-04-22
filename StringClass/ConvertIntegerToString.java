package StringClass;

public class ConvertIntegerToString {
    public static void main(String[] args) {
        int a= 1234;
        int b= -2345;

        String s1= Integer.toString(a);
        String s2= Integer.toString(b);

        System.out.println("s1 : "+ s1);
        System.out.println("s2 : "+ s2);


        byte c=9;
        String s3= Byte.toString(c);
        System.out.println(" Byte is " +s3);

        boolean d= true;
        String s4= Boolean.toString(d);
        System.out.println(" Boolean is " +s4);

        char e= 'a';
        String s5= Character.toString(e);
        System.out.println(" char is " +s5);
    }
}
