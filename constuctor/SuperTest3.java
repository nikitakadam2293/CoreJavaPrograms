package constuctor;

class Person1
{
    int age=50;
}
public class SuperTest3 extends Person1{

    int age=30;  // instance variable
/*
//    void ageA()
//    {
//        int age=20;  // local variable
//       // System.out.println(super.age);
//        System.out.println(age);
//        //System.out.println(this.age);
//
//        //
//    }
*/

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.age);
        SuperTest3 o=new SuperTest3();
        //o.ageA();
        //System.out.println(this.age);


    }







}
