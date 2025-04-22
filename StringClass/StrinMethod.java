package StringClass;

import java.util.Arrays;
import java.util.Calendar;

public class StrinMethod {
    public static void main(String[] args) {
        String str= "Java";
        // Java program to get the character (Unicode code point) at the given index within the string.
         System.out.println(str.codePointAt(2));  //118

/*Unicode code point:=
        A Java string consists of a group of characters and each character is associated
        with a Unicode point value (alias ASCII value). So to get the Unicode point value
        of a character in a string we will use the codepoint() method.
*/

        ///Write a Java program to create a String object with a character array.
        char arr[] = new char[] {'1','2','3','4'};

        String str1= String.copyValueOf(arr);
        System.out.println("str1 : "+str1); //str1 : 1234

        // endWith()
        boolean b= str.endsWith("va");
        System.out.println(" end with  "+b); // end with  true


        //Write a Java program to print the current date and time in the specified format.
        Calendar c= Calendar.getInstance();
        System.out.format("%tB %te, %tY%n",c,c,c);  //February 10, 2025


        /*
        * %tB: Prints the full name of the month for the given date. For example:
        January, February, etc.
        %te: Prints the day of the month as a number (1-31), without leading zeros.
        , : A literal comma followed by a space.
        %tY: Prints the year in four digits. For example:
        2023, 2025, etc.
        %n: Inserts a platform-independent newline character*/

        //====
        //Write a Java program to get the contents of a given string as a byte array.

        String str2 ="java language";

        byte[] barr= str2.getBytes();

        String sbyte= new String(barr);
        System.out.println("byte array example : "+sbyte); //byte array example : java language


       ////////////////
        byte [] bytearr= {65,66,67,68};

        String sb = new String(bytearr);

        System.out.println("sb : "+sb); //ABCD


        byte barr1[] = {111,112,113,114};
        String  sarr1 = new String(barr1);
        System.out.println("sarr1 : "+sarr1);  //sarr1 : opqr


        //Write a Java program to get the contents of a given string as a character array.

        String s4 = "java is lang";

        char arr4[] = s4.toCharArray();
        System.out.println("s4 is : ");
        for (int i=0; i<s4.length();i++)
        {
            System.out.println(arr4[i]);   //
        }

/*
s4 is :
j
a
v
a

i
s

l
a
n
g


* */

        // (hashcode)  Write a Java program to create a distinct identifier for a given string.

        System.out.println("s4 hashcode : "+s4.hashCode());  //s4 hashcode : -691723482

        //Write a Java program to get the index of all the characters of the alphabet.

        String s5 = "java is lang";
        System.out.println("index of : "+s5.indexOf( "j" )); //index of : 0

        //Write a Java program to get the Canonical representation of the string object.
        String s6 = "Java Exersise";
        String s7 = new StringBuffer("Java").append("Exersise").toString();

        String s8= s7.intern();

        System.out.println("s6==s7" + s6 == s8);
        System.out.println("s6==s8" + s7 == s8);


        System.out.println("s6: "+s6);   //s6: Java Exersise

        System.out.println("s7: "+s7);   //s7: JavaExersise





    }
}
