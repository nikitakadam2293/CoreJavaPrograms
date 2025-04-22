package Static;

public class    StaticExample8Jan {
    static int var1 = 10;   //static
    int var2 = 10;  //instance
    public static void main(String[] args) {
        //static blocks  instance blocks
        // Let's create two instances of StaticExample
        StaticExample8Jan object1 = new StaticExample8Jan();
       /* object1.var1=20;
        object1.var1=30;
        System.out.println(object1.var1);
        object1.var1=40;*/

        object1.var1=20;///////////////
        object1.var2=20;

        //        //For Instance variable, each object gets his own copy/value
        //        but all objects share same Copy/value of static variable.
        StaticExample8Jan object2 = new StaticExample8Jan();
        object2.var1=30;
        object2.var2=30;
         System.out.println(" Object1.var1 tttt " + object1.var1); //30
        System.out.println(" Object1.var2 tttt " + object1.var2);//20

        System.out.println(" Object2.var1 tttt " + object2.var1); //30
        System.out.println(" Object2.var2 tttt " + object2.var2);//30

        StaticExample8Jan object3 = new StaticExample8Jan();
        object3.var1=40;
        object3.var2=40;
        System.out.println(" Object1.var1 tttt " + object1.var1); //40
        System.out.println(" Object1.var2 tttt " + object1.var2);//20

        System.out.println(" Object2.var1 tttt " + object2.var1); //40
        System.out.println(" Object2.var2 tttt " + object2.var2);//30

        System.out.println(" Object3.var1 tttt " + object3.var1); //40
        System.out.println(" Object3.var2 tttt " + object3.var2);//40

        object1.var1=70;//////////////////
        System.out.println(" Object1.var1 tttt " + object1.var1); //70
        System.out.println(" Object1.var2 tttt " + object1.var2);//20

        System.out.println("object2.var1 "+object2.var1); //70     // (Prints:40 70)
        System.out.println("object2.var2 "+object2.var2); //30     //(Prints:30 30)

        System.out.println("object3.var1 "+object3.var1); //  70    ( Prints:40 70)
        System.out.println("object3.var2 "+object3.var2); //   40   (Prints:40 40)

        object3.var2=100;
        System.out.println("object3.var2"+object3.var2); //100

        object1.var1=50;
        object1.var2=10;
        System.out.println(object2.var1); //50
        System.out.println(object3.var1); //50
        System.out.println(object2.var2); //30
        System.out.println(object3.var2); //100




    }
}

