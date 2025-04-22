package polymorphism.overriding;

class ParrentOverride
{
    void test()
    {
        System.out.println("This is a parent class method");
    }
}
class ChildParentOverride1 extends ParrentOverride
{

}
class ChildParentOverride2 extends ParrentOverride
{
    @Override
    void test()
    {
        System.out.println("Child 2 also wanted to change the implementation now ");
    }
}
public class MethodOverridingIntro extends ParrentOverride {
    @Override
    void test()
    {
        System.out.println("This child wants to change the implementation given in Parent class");
    }

    public static void main(String[] args) {
        ChildParentOverride1 child1 = new ChildParentOverride1();
        child1.test();

        ChildParentOverride2 child2 = new ChildParentOverride2();
        child2.test();

        MethodOverridingIntro child3 = new MethodOverridingIntro();
        child3.test();
    }

}
/*
* This is a parent class method
Child 2 also wanted to change the implementation now
This child wants to change the implementation given in Parent class*/