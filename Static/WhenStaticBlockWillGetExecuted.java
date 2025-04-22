package Static;

public class WhenStaticBlockWillGetExecuted {
    static {
        System.out.println("dummy static blocks ");  //
    }

    static {
        System.out.println("This code will get executed before we call main method and" +
                " as soon as this class get loaded into memory ");  //
    }
    //I want to execute some code before I call main() method?  =>

    public static void main(String[] args) {
        System.out.println("Code inside main method");    //
    }
}
