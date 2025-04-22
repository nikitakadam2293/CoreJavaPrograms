package ExceptionHandeling;

// yes we write try catch block in main() method
public class CanWriteTryCatchInMainMethod {
    public static void main(String[] args) {
        try
        {
            int c = 10/0;
        }
        catch (Exception e)
        {
            System.out.println("Exception occure");
        }
    }
}
