package ExceptionHandeling;

// class 2 methods => m1() and m2()  => call m2() from m1() and call m1() from m2()
public class StackOverflowError {
    void m1()
    {
        m2();
    }
    void m2()
    {
        m1();
    }
    public static void main(String[] args) {
        StackOverflowError obj = new StackOverflowError();

        obj.m1();
    }
}
/*
Exception in thread "main" java.lang.StackOverflowError
	at ExceptionHandeling.StackOverflowError.m2(StackOverflowError.java:10)
	at ExceptionHandeling.StackOverflowError.m1(StackOverflowError.java:6)
* */