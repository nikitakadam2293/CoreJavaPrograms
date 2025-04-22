package StringClass;

public class StringMethod {
    public static void main(String[] args) {
        String s= "javaprograminhg";

        System.out.println(s.length()); //15

        System.out.println(" character at 0 rd position : " + s.charAt(0));  // string index start at 0 index

        System.out.println("Substring : " + s.substring(1)); //avaprograminhg

        System.out.println("Substring in between specified length : " + s.substring(1, 5)); //avap

        System.out.println("Concate string is : " + s.concat( "  language")); // javaprograminhg  language

        System.out.println(" Index of : "+ s.indexOf("s"));  //-1 if string is not prsent it return -1 s default value

        System.out.println(" Index of ==: "+ s.indexOf("l")); //-1 because after using concate new string is created (#heap ) javaprograminhg  language not change in existing string
        // which is already present in string

        System.out.println(" Index of v : "+ s.indexOf("v"));

        System.out.println(" Index of m : "+ s.indexOf("m" , 8));  //10

        System.out.println(" last index is : "+ s.lastIndexOf("g")); //14

        System.out.println(" check two string are equal:  " + s.equals("java"));  //false

        System.out.println("Equal ignore case checking equality : " +s.equalsIgnoreCase("hava"));//false

        System.out.println("Equal ignore case checking equality ( upper case & lower case no  mater)  : " +s.equalsIgnoreCase("JAVAprograminhg"));  //true

        System.out.println("Compare to :" + s.compareTo("javaprograminhg  "));//-2

        System.out.println("CompareToIgnoreCase :" + s.compareToIgnoreCase(" JAvaprograminhg "));//74  //j=106- space =32==74

        String s1="aa";
        String s2="x";
        System.out.println("New  " +s1.compareTo(s2));   //a=97 - x=120  = -23

        System.out.println("New 2  " +s2.compareTo(s1));   // x=120 - a=97 = 23

        System.out.println("compareToIgnoreCase ====  : " +s1.compareToIgnoreCase(s2));  // -23
        System.out.println("compareToIgnoreCase  ===== : " +s2.compareToIgnoreCase(s1));   // 23

        String s3= "HeLlo";
        System.out.println("Lower case : "+ s3.toLowerCase()); //hello

        System.out.println("Upper case : "+ s3.toUpperCase());  //HELLO


        String s4="    Hello this is String  ";
        System.out.println("Using rtrim method :" + s4.trim());

        System.out.println("Replace character: " + s.replace('a','m'));  //jmvmprogrmminhg
        System.out.println(s);  //javaprograminhg

        System.out.println("check character contain it :" + s.contains("vpr"));  //false
        System.out.println("check character contain it :" + s.contains("java"));  //true
        System.out.println("check character contain it :" + s.contains("inhg"));  //true



        char arr[] =s.toCharArray();
        System.out.println( arr); //javaprograminhg

        System.out.println("Start with method : "+ s.startsWith("j"));  //true


        System.out.println("Start with method 1: "+ s.startsWith("java"));  //true

        System.out.println("Start with method 2: "+ s.startsWith("J"));  //false

        System.out.println("Start with method :3 "+ s.startsWith("n"));  //false
        //
        String msg= String.join("-","hello"," I ","am"," java");
        System.out.println(msg);//hello- I -am- java

        System.out.println("Is blank method: " +s.isBlank()); //false

        String s6="Hello";
        String s7="Hello1";
        String s8=new String("Hello1");

        System.out.println(s6==s7);  //false
        System.out.println(s7==s8);   //false

        String s9= s8.intern();
        System.out.println(s7==s8);  //false
        System.out.println(s7==s9);  //true


        String s10 = "a";
        String s11 = "awww";
        System.out.println(s10.compareTo(s11));  //-3
        System.out.println(s11.compareTo(s10));  //3



    }
}
