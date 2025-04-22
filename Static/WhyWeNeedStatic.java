package Static;

public class WhyWeNeedStatic {
    int age;
    static int salary;

    public static void main(String[] args) {
        WhyWeNeedStatic obj1 = new WhyWeNeedStatic();
        obj1.age=100;
        obj1.salary=200;
        WhyWeNeedStatic obj2 = new WhyWeNeedStatic();
        obj2.age=300;
        obj2.salary=400;

        System.out.println("Access variable using obj1 "+ obj1.age + " and " + obj1.salary );
        //        System.out.println("Access variables using obj1 "+ obj1.age + " and "+obj1.salary);  // age = 100 salary = 400
        System.out.println("Access variable using obj2 "+ obj2.age + " and " + obj2.salary );


    }
}
