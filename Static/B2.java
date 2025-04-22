package Static;

class A2 {
        static {
            System.out.println("Static Block of A");
        }

        {
            System.out.println("Instance Block of A");
        }

        A2() {
            System.out.println("Const...of A");
        }

        A2(int a) {                               //
            System.out.println("para Const...of A");
        }

        static int and = 10;                    //Static variable

        static void add() {
            System.out.println("Static Mehtod of Parent class");
        }
    }

    class B2 extends A2 {
        static int as = 20;

        static {
            System.out.println("Static block child");
        }

        {
            System.out.println("instance block child");
        }

        B2() {
            System.out.println("child const");
        }

        B2(int a) {
            System.out.println("child para const");
        }

        static void add() {
            System.out.println("Static method of child class");
        }



        public static void main(String[] args) {
          B2 b = new B2(12);  //a2 B2 satic/ A2 inst / A2 const //B2 inst /B2 const para
          A2 a = new B2(12);   //static A2 / B2 static/ A inst /A const// B inst/B para con
           B2.add();  //B2 static me
            System.out.println(as);  //20
            System.out.println(and);  //10


        }
    }
/*
Static Block of A
Static block child
Instance Block of A
Const...of A
instance block child
child para const
Instance Block of A
Const...of A
instance block child
child para const
Static method of child class
20
10
*/
