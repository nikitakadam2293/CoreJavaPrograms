package polymorphism.overriding;

public class ObjectEqualMethod {
    String value ;
    ObjectEqualMethod ( String value)
    {
        this.value = value;
    }

    public static void main(String[] args) {


      ObjectEqualMethod obj = new ObjectEqualMethod("Hello");
        ObjectEqualMethod obj1 = new ObjectEqualMethod("Hello");


        System.out.println(obj.equals(obj1));
        System.out.println(obj==obj1);

        ObjectEqualMethod ref1;
        ObjectEqualMethod ref2;

        ref1=new ObjectEqualMethod("jana");
        ref2=new ObjectEqualMethod("jana");
        System.out.println(ref1==ref2);






       System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
               // equals method uses == operator to check memmory address of obj and obj1


        System.out.println("Are obj1 is equals obj2    ?" + obj.equals(obj1));
        System.out.println(obj== obj1);
    }}


