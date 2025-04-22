package StringClass;

public class ObjectClassMethod {
    int a=100;

    public static void main(String[] args) {
        // hashcode is nothing but unique identifier for the object

        ObjectClassMethod obj= new ObjectClassMethod();
        System.out.println(" Hashcode of obj is  "+ obj.hashCode());

        ObjectClassMethod obj1= new ObjectClassMethod();
        System.out.println(" Hashcode of obj1 is  "+ obj1.hashCode());

        String s1= new String(" java");
        String s2=" java";

    }
}
