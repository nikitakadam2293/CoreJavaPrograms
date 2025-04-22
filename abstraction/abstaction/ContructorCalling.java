package abstraction.abstaction;
abstract class ClassA
{
    ClassA()
    {
        System.out.println("ClassA");
    }
}
class ClassB extends ClassA
{
    ClassB()
    {
        System.out.println("ClassB");
    }
}
public class ContructorCalling {
    public static void main(String[] args) {
        ClassB o = new ClassB();
    }
}
