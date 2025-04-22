package ExceptionHandeling;

public class CanCatchOutOfMemoryError {

    public static void main(String[] args) {

        try
        {
            String arr[] = new String[1000000*1010010101];

        }
        catch(OutOfMemoryError e)
        {
            System.out.println("Out of memmory");
        }
    }

}
//Out of memmory