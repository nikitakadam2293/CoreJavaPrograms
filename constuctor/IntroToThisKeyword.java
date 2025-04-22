package constuctor;

class ThisParent
{
    ThisParent()
    {
        System.out.println("Parent class no arg constructor");
    }
}
public class IntroToThisKeyword  {
    public IntroToThisKeyword() {
        this("java program",100000);
        System.out.println("Child class no arg constructor");
    }
    public IntroToThisKeyword(String name) {
        this();
        System.out.println("Child class 1 arg constructor");
    }
    public IntroToThisKeyword(String address, long salary) {
        System.out.println("Child class 2 arg constructor");
    }

    public static void main(String[] args) {
        IntroToThisKeyword obj=new IntroToThisKeyword("java");
    }
}
