package ExceptionHandeling;

public class MultipleCatchScenario2 {
    public static void main(String[] args) {
        String s = "java programming";
        try
        {
         // s=null;
          int arr[] ={0,1,2,3,4,5};

            System.out.println("Length of s :"+s.length());

            int b= 6;
            System.out.println(arr[b]);
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }

    }
}
