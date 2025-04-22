package StringClass;

public class StringBuffer1 {
    public static void main(String[] args) {

        // StringBuffer

        StringBuffer str= new StringBuffer("Hello");

        StringBuffer str2= str.append("World");
        System.out.println("str " +str);  // mutable  //HelloWorld
        System.out.println("str2 "+  str2);  //  HelloWorld

        System.out.println(str.length());  //10 due to mutable

        //String Builder

        StringBuilder str3= new StringBuilder("StringBuilder");
        System.out.println(str3.append("Is Class of "));  //StringBuilderIs Class of


        System.out.println(" Reverse StringBuffer"+str3.reverse());  // Reverse StringBuffer fo ssalC sIredliuBgnirtS


        // convert string buffer to string builder

        StringBuffer str4= new StringBuffer("Hello");
        String s5= str4.toString();

        StringBuilder str5= new StringBuilder(s5);

        System.out.println("StringBuffer str4 : " +  str4); //Hello


        System.out.println("String str5 : " +  str5);  //Hello


        // convert StringBuilder to stringbufer

        StringBuilder str6 = new StringBuilder("Java");

        String str7 = str6.toString();

        StringBuffer str8 = new StringBuffer(str7);

        System.out.println("StringBuilder str6 " + str6);  //Java
        System.out.println("String str7 : "+ str7);    //Java
        System.out.println("StringBuffer str8: " +str8 );   //Java


    }

}
