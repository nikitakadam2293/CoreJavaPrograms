package abstraction.abstaction;

abstract class Shape
{
    abstract void draw();
    abstract void show();

}
public class IndirectCreationOfObjectOfAbstractClass {
    public static void main(String[] args) {

        Shape obj = new Shape() {
            @Override
            void draw() {

                System.out.println("Abstract Method draw");
            }

            @Override
            void show() {
                System.out.println("Abstract Method show");

            }

            void m1()
            {
                System.out.println("Hello world");
            }
        };
        System.out.println("hello");
        obj.draw();
        obj.show();
        //obj.m1();
    }

}
/*
hello
Abstract Method draw
Abstract Method show
* */