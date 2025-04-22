package ExceptionHandeling;

public class TestNullPointerException {
    int a=10;

    void test() {
        System.out.println("called test method");
    }

    public static void main(String[] args)
    {

        TestNullPointerException npe = null;
                //new TestNullPointerException();
        /*if(npe != null)
        {
            System.out.println(npe.a);

       }*/
        if(npe == null)
        {
            npe=new TestNullPointerException();
            System.out.println(npe.a);

        }
         npe.test();  // remember

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < intArray.length; i++) {
            //System.out.println();
            System.out.println("Value of int array at index " + i + "is " + intArray[i]);

        }
    }
}