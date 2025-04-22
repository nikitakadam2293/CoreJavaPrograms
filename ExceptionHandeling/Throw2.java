package ExceptionHandeling;

import java.io.IOException;

public class Throw2 {

    void test() throws IOException {
        throw new IOException("File No");
    }

    public static void main(String[] args) {

        Throw2 obj = new Throw2();
        try {
            obj.test();
            System.out.println("try ");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
