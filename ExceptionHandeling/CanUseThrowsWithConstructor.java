package ExceptionHandeling;

import java.io.IOException;

public class CanUseThrowsWithConstructor {

    CanUseThrowsWithConstructor() throws IOException
    {
        System.out.println("constudo");
    }

    public static void main(String[] args) {

        try {
            CanUseThrowsWithConstructor o = new CanUseThrowsWithConstructor();
        } catch (IOException e) {
        }
    }

}
//constudo