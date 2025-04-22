package Static;

public class InstanceBlockTest {
    {
        System.out.println("This is a instance block." +
                "Code inside instance block will get called " +
                "after we create an object of a class and before constructor start exicution");

    }
    InstanceBlockTest()
    {
        System.out.println("constructor of a class");
    }
    public static void main(String[] args) {
        InstanceBlockTest obj=new InstanceBlockTest();
    }
}
