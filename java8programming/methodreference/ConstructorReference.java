package java8programming.methodreference;

class Student
{
    Student()
    {
        System.out.println("Creating object of student class");
    }
    public void display()
    {
        System.out.println("Student class");
    }
}


@FunctionalInterface
interface  Provider
{
    public Student getStudent();
}
public class ConstructorReference {

    public static void main(String[] args) {
        System.out.println("Constructor Reference ");

        // provide implementation to getStudent() method of Provider
        // interface

      /*  Provider provider = ()->{
            return new Student();
        };
        instead of above we use below  constuctor reference
        */

        // COnstructor Reference
        // ClassName :: new
        Provider provider = Student::new;

        Student student= provider.getStudent();
        student.display();
    }
}
