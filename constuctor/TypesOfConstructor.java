package constuctor;

class  AA
{
    AA()
    {

    }
}
public class TypesOfConstructor {
    int age;
    long salary;
    public TypesOfConstructor(){
        System.out.println("No-Argument Constructor");
    }
    public TypesOfConstructor(int aaaag,long sallllary) {
        System.out.println("Argument Constructor");
    }

    public static void main(String[] args) {
       // TypesOfConstructor ob= new TypesOfConstructor();
        TypesOfConstructor ob1= new TypesOfConstructor(11,111111);
        ob1.test(1001,10000);
        ob1.test();
    }
    void test(int aaaag,long sallllary)
    {
        System.out.println("Method call with params ");
    }
    void test()
    {
        System.out.println("Method call without params");
    }
}
