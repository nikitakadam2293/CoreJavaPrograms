package StringClass;

public class ObjectClassMethod1 {

    private String firstName;
    private String lastName;
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName( String firstName )
    {
        this.firstName=firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    void setLastName( String lastName)
    {
        this.lastName=lastName;
    }

    public static void main(String[] args) {
        ////hashcode is nothing but unique identifier for the Object.

         final int a= 10;
         //a=55;

        ObjectClassMethod1 obj= new ObjectClassMethod1();

        obj.setFirstName("java");
        obj.setLastName("Programing");
       System.out.println("  firstname is: "+obj.getFirstName()+" and  "  + " Last Name :" + obj.getLastName());


       obj.setLastName("  Language ");  // Mutable
      System.out.println("==  firstname is: "+obj.getFirstName()+" and  "  + " Last Name :" + obj.getLastName());
        //======================

        String s1=" java  oops";
        s1= " hello";

        System.out.println("s1 ==="+s1);  //s1 === hello  bcz s1 change reference from  java  oops to  hello


        String sobj= new String("  Nikita");
        sobj=" kadam";

        System.out.println("  sobj "  + sobj);
        //===============

 //       System.out.println(s1);
//         s1= s1.concat(" Programming language");
//
//        System.out.println(s1);  // java  oops Programming language
//
//        String s2= "java";
//        System.out.println(s2);  //java








        //=====================

       /* System.out.println(" Hash code of obj is  "+ obj.hashCode());

        ObjectClassMethod obj1= new ObjectClassMethod();
        System.out.println(" Hashcode of obj1 is  "+ obj1.hashCode());

        String s1= new String(" java");
        String s2=" java";
*/
    }
}
