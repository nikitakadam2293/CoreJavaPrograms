package constuctor;

class SuperParent
{
    SuperParent()
    {
        System.out.println("This is super parent class no argument constructor");
    }
}
class ConstructorParent extends SuperParent
{
    public ConstructorParent() {
        System.out.println("This is a parent constructor");
    }
}
public class ConstructorChainingIntro {
    public ConstructorChainingIntro() {
        super();
        System.out.println("This is a child constructor");
    }
    public static void main(String[] args) {

       // ConstructorChainingIntro child=new ConstructorChainingIntro();
        //ConstructorParent parent=new ConstructorParent();
}

}