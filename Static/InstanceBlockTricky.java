package Static;

public class InstanceBlockTricky {
    InstanceBlockTricky()
    {
        System.out.println("No argument constructor");
    }
    InstanceBlockTricky(int a)
    {
        System.out.println(" argument constructor");
    }
    {
        System.out.println("1st instance block");
    }
    {
        System.out.println("2nd instance block");
    }

    public static void main(String[] args) {
        InstanceBlockTricky obj=new InstanceBlockTricky();
        InstanceBlockTricky obj1=new InstanceBlockTricky(10);

    }

}
