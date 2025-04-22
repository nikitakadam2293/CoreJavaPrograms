package constuctor;

 class Person
{
    int age=50;
}
public class SuperTest2 extends Person{

        int age=30;  // instance variable
        void ageA()
        {
            int age=20;  // local variable

            System.out.println("super "+super.age);  // 50
            System.out.println("this"+this.age);  // 30
            System.out.println(age); //20


        }

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.age);  // 50
        System.out.println(p.age) ; // 50

        SuperTest2 o = new SuperTest2();
        o.ageA();
    }







}
