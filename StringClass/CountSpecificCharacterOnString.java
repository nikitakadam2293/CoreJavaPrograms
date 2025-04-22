package StringClass;


import java.util.Scanner;

public class CountSpecificCharacterOnString {
    Scanner sobj= new Scanner(System.in);

    void displaySpecificChar()
    {
        System.out.println("Enter String: ");
        String str= sobj.nextLine();   // java is lang

        System.out.println("Enter Character : ");
        char c= sobj.next().charAt(0);   //i
        int count=0;

/*        // using charAt() method
        for(int i= 0; i< str.length() ; i++)
        {
            if(str.charAt(i) == c)
            {
                count++;
            }
        }
        System.out.println("character " + c+ "found : "+ count);
 */

        // using toCharArray()

        char arr[] = str.toCharArray();
        for (int i= 0; i< arr.length; i++)
        {
            if (arr[i]== c)
            {
                count++;
            }

        }
        System.out.println("character " + c+ "found : "+ count);


    }


    public static void main(String[] args) {

        CountSpecificCharacterOnString obj= new CountSpecificCharacterOnString();
        obj.displaySpecificChar();
    }
}
