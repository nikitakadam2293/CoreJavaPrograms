package Static;

public class StaticKeywordIntro {
    static int age = 100;
    int salary = 100000;

    public static void main(String[] args) {
        StaticKeywordIntro obj = new StaticKeywordIntro();

        System.out.println("value of static variable is "+age);   //
        System.out.println("value of instance variable is "+obj.salary); //

        demo();
        obj.test();
    }

    void test(){
        System.out.println("This is non-static method, need to create object to access this method");
    }

    static void demo(){
        System.out.println("This is static method, don't need to create object to access this method");
    }


    static class StaticClass{

    }
}

