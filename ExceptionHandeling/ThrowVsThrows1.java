package ExceptionHandeling;

import java.io.IOException;

public class ThrowVsThrows1 {


    void test()
    {
        throw new NullPointerException("Runtime Exception OCcure");
    }

    public static void main(String[] args) {
        ThrowVsThrows1 obj = new ThrowVsThrows1();
        obj.test();
    }
}