package Static;

public class VariableTypes {

    private int age;  //instance variable   primitive   stack
   // VariableTypes o = new VariableTypes();   //User defined
    String ss = new String("Java");    //in built
    private static int salary; //non-instance variable

    public static void main(String[] args) {
        VariableTypes ll =  new VariableTypes();
        System.out.println(ll.age);                // 0
        System.out.println(VariableTypes.salary);  // 0
    }

    public void test(){
        String local = new String("Java");  //
        int b = 201; //Local variable  => you must assign value to local variable before we use it
        System.out.println("age is Value of age is "+b);
    }
}
