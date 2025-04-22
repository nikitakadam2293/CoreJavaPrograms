package abstraction.abstaction;

//IndirectCreationOfObjectOfAbstractClass related to this class
public class Main{


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

             new Shape(){

                @Override
                void draw() {
                    System.out.println("draw");
                }

                @Override
                void show() {
                    System.out.println("show");

                }

                void m1()
                {
                    System.out.println("m1 calling");

                }
            }.m1();

        }
}
