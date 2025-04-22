package polymorphism.overriding;

// overloading possible changing return type


class Overloading
{
    int add(int a, int b)
    {
        return a+b;
    }
    float add(float a, float b )
    {
        return a+b;
    }

}


public class ReturnTypeOverridingScenario extends Overloading
{

    public static void main(String[] args) {

        Overloading o = new Overloading();
        System.out.println("int addition : "+o.add( 11,22));
        System.out.println("float addition : "+o.add(11.331f,11.33f));
    }
}
