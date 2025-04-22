package ExceptionHandeling;

import java.io.IOException;

class Parent {

    public void play() throws IOException {
        throw new IOException("tired, can't play");
    }

}

class Child extends Parent {
/*

    public void play() throws Exception{
        throw new Exception("Let's play");
    }
*/

}

public class ExceptionScenarioIQue6 {
    /*. What does the following program will print?
    hint: Exception Handling and Method Overriding
*/

    public static void main(String[] args)
    {
        try {
            Parent o = new  Child();
            o.play();

        }
        catch (Exception e)
        {

        }

    }

}
// refer in notebook method overriding rule 11