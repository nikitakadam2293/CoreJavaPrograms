package ExceptionHandeling;

public class CompileTimeException {
    void test()
    {
        System.out.println("Test Method Called");
    }

    public static void main(String[] args)  {

        // different ways of creating objects in java

       /* CompileTimeException obj= new CompileTimeException();
        obj.test();*/

        /////============

        /*try {
            Class cls = Class.forName("ExceptionHandeling1.CompileTimeException" );
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            //System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
*/

       Class cls = null;
        try {
            cls = Class.forName("ExceptionHandeling1.CompileTimeException");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        CompileTimeException obj = null; //downcasting
        try {
            obj = (CompileTimeException) cls.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        obj.test();
    }
}
