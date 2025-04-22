package StringClass.MethodOfString;

public class RepalceMethod {
    public static void main(String[] args) {
        String str = "java lang java is oops lang";
        String str2 = str.replace('a','z');   // for replacing character
        System.out.println("str : "+str);  //str : Java lang

        System.out.println("str2 : "+str2); //str2 : Jzvz lzng


        String str3=  str.replaceAll("java", "hava");  //for replacing word

        System.out.println("str3 : "+str3);   //str3 : hava lang hava is oops lang

        //startWith()
        String str4 = "java";
        System.out.println("start with : "+str.startsWith(str4));  //start with : true

        //substring
        String str5 = str.substring(6,12);
        System.out.println("substring : " +str5);  //substring : ang ja


        // lowercase . 29. Write a Java program to convert all characters in a string to lowercase.
        String str6= "Java IS A ProGraMiNG lanG";
        String str7 = str6.toLowerCase();
        System.out.println("str 6 : "+str6) ; //str 6 : Java IS A ProGraMiNG lanG

        System.out.println("str 7 : "+str7);  //str 7 : java is a programing lang

        //30. Write a Java program to convert all characters in a string to uppercase.
        String str8 = str6.toUpperCase();
        System.out.println("str 8 : "+str8); //str 8 : JAVA IS A PROGRAMING LANG


        //

    }
}
