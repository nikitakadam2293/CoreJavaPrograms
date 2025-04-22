package ExceptionHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Throws1 {
    void findFile() throws IOException
    {

        System.out.println("first");
        File file = new File("demo.txt");
        FileInputStream stream = new FileInputStream(file);

        System.out.println("findFile");
    }

    public static void main(String[] args) {

        Throws1 obj = new Throws1();
        try {
            System.out.println("try1");
            obj.findFile();
            System.out.println("try");
        } catch (IOException e) {

            System.out.println(e);
        }
    }
}
