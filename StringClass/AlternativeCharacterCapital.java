package StringClass;

import java.util.Scanner;

public class AlternativeCharacterCapital {

    void alternativeLeterCapital()
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("Enter String : ");


        String str= sobj.nextLine();  // java is language

        StringBuffer sb= new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if( i%2 == 0 )
            {
                char ch= Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else
            {
                char c= Character.toLowerCase(str.charAt(i));
                sb.append(c);
            }
        }
        //System.out.println(sb);

        System.out.println(sb.toString());


        /*System.out.println(sb);
        System.out.println(sb.hashCode());*/




       /* for (int i= 0; i<str.length(); i++ )
        {
            //int index= str.indexOf(i);
            if( i % 2 == 0)
            {
               char c= Character.toUpperCase(str.charAt(i))  ;
               str=str.replace(str.charAt(i), c);
            }
            else
            {
                char ch= Character.toLowerCase(str.charAt(i));
                str=str.replace(str.charAt(i), ch);
            }
        }
        System.out.println(str);
        *//*
        java is
        JaVa iS
        =========
        java is language
        JaVa iS LaNGUaGe

        using above logic output not give in proper way
        */

    }


    public static void main(String[] args) {

        AlternativeCharacterCapital o = new AlternativeCharacterCapital();
        o.alternativeLeterCapital();


    }
}
