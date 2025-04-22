package constuctor;

class An{
    An()   //3
    {
        System.out.println("A");
    }
}
class SuperKeyword extends An
{
    String name2;
    public SuperKeyword(String age) {
        System.out.println("Parameterised Constructor");
    }
    public SuperKeyword(String name, int age)  //2
    {


        System.out.println("Parameterised Constructor taking 2 params"+"name is  "+ name+ " age is "+ age);
    }
}
public class SuperKeywordParentParamConstructor extends SuperKeyword {
    public SuperKeywordParentParamConstructor(String s,int a) {
        super("JavaTest",1001);   //1

        //super("java",100);

        System.out.println("Child Class Constructor");

    }

    public static void main(String[] args) {
        SuperKeywordParentParamConstructor obj = new SuperKeywordParentParamConstructor("java",10000);
    }
}
