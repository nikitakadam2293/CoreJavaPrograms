package multithreading;

import java.io.Serializable;

public class MarkerInterfaceExample implements Serializable {

    public static void main(String[] args) {

        MarkerInterfaceExample o = new MarkerInterfaceExample();

        if(o instanceof Serializable)
        {
            System.out.println("o is instance of serializable ");
        }
        else
        {
            System.out.println("Not  instance of serializable ");
        }
    }


}
