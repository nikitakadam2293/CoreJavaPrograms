package StringClass;

public class String2 {
    public static void main(String[] args) {

        // first way to create string object using  new keyword
        String s1= new String("java");
        String s2= new String("java");

        // whenever we create a String Object using new keyword  it will always create a new object
        // it will get store in heap memmory

        // 2nd way using String literal
        String t1="java";
        String t2="java lang";

        System.out.println(" Hash code of s1 " + s1.hashCode() +
                "  Hash code of s2  " + s2.hashCode()); // Hash code of s1 3254818  Hash code of s2  3254818


        System.out.println(" Hash code of t1 " + t1.hashCode() +
                "  Hash code of t2  " + t2.hashCode()); // Hash code of t1 3254818  Hash code of t2  3254818




    }

}
