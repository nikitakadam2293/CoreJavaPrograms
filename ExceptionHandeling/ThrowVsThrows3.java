package ExceptionHandeling;

import java.nio.file.FileAlreadyExistsException;

public class ThrowVsThrows3 {
    void test()throws FileAlreadyExistsException

    {
        throw new FileAlreadyExistsException("File NOT F");
    }

    public static void main(String[] args)// throws FileAlreadyExistsException
     {
        ThrowVsThrows3 obj = new ThrowVsThrows3();

         try {
             obj.test();
         } catch (FileAlreadyExistsException e) {
             throw new RuntimeException(e);
         }

     }
}
