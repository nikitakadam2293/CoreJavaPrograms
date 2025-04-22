package ExceptionHandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException1 {

    public static void main(String[] args){

        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            //System.out.println(e);
        }
//        BufferedReader br = new BufferedReader(reader);
//
//        String data= null;
//        while (true)
//        {
//            try {
//                if (!((data = br.readLine()) != null)) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(data);
//        }
//
//        try {
//            br.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
