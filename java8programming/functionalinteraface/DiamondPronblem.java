package java8programming.functionalinteraface;


import javax.imageio.stream.ImageInputStream;

interface I1
{
    default void d1()
    {
        System.out.println("Default Method of I1 interface");
    }
}

interface I2
{
    default void d1()
    {
        System.out.println("Default Method of I2 interface");
    }
}
public class DiamondPronblem implements I1,I2 {

    @Override
    public void d1() {
        I1.super.d1();  //Default Method of I1 interface
        I2.super.d1();  // Default Method of I2 interface


    }

    public static void main(String arg [])
    {
        DiamondPronblem diamondPronblem = new DiamondPronblem();
        diamondPronblem.d1();
    }

}
