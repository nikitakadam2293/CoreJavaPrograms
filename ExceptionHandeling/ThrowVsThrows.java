package ExceptionHandeling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowVsThrows {

    //throw IOException compile time // throws  IOException compile time

    void test() throws  IOException // IOException, SQLException
    {
        throw new  IOException();
    }
    public static void main(String[] args)
    {
        ThrowVsThrows obj = new  ThrowVsThrows();
        //obj.test();

    }

}
