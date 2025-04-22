package ExceptionHandeling;

import java.io.IOException;

public class ThrowVsThrows5 {

    void test()
    {
        System.out.println("test 1");
       // throw new IOException();  //runtime
        //System.out.println("test 2");

    }

    public static void main(String[] args) {

        ThrowVsThrows4 o = new ThrowVsThrows4();
        o.test();
    }
}
