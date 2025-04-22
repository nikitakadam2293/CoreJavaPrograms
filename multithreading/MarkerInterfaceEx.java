package multithreading;

interface Marker
{

}

public class MarkerInterfaceEx implements Marker {

    public static void main(String[] args) {

        MarkerInterfaceEx obj = new MarkerInterfaceEx();

        if(obj instanceof Marker  )
        {
            System.out.println("Instance ");
        }
        else
        {
            System.out.println("No instance ");
        }
    }


}
