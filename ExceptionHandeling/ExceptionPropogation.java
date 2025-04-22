package ExceptionHandeling;

public class ExceptionPropogation {
    // printing stack trace
    public static void main(String[] args) {

        ExceptionPropogation obj = new ExceptionPropogation();

        obj.m1();
    }
    void m1()
    {
        m2();
    }
    void m2()
    {
          m3() ;
    }
    void m3()
    {
        m4();
    }
    void m4()
    {
        int a = 100/0;
    }
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandeling.ExceptionPropogation.m4(ExceptionPropogation.java:24)
	at ExceptionHandeling.ExceptionPropogation.m3(ExceptionPropogation.java:20)
	at ExceptionHandeling.ExceptionPropogation.m2(ExceptionPropogation.java:16)
	at ExceptionHandeling.ExceptionPropogation.m1(ExceptionPropogation.java:12)
	at ExceptionHandeling.ExceptionPropogation.main(ExceptionPropogation.java:8)

* */