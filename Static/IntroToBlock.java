package Static;

public class IntroToBlock {

    static {
        System.out.println("what is this?");
        int a =100;
        // return 1000;
    }

    //no return type
    //no name

    void method(){
        System.out.println("This is method");
        int b  = 200;
    }

    public static void main(String[] args) {
        IntroToBlock obj = new IntroToBlock();
        obj.method();
    }

}
