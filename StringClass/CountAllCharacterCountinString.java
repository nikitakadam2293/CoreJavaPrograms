package StringClass;

import java.util.Scanner;

public class CountAllCharacterCountinString {
    Scanner sobj= new Scanner(System.in);

    void eachCharacterCount()
    {
        System.out.println("Enter String: ");
        String str= sobj.nextLine();   // java is lang


       /* System.out.println("Enter Character : ");
        char c= sobj.next().charAt(0);   //i*/

        char arr[] = str.toCharArray();
        boolean b[] = new boolean[str.length()];


        for (int i=0; i< arr.length; i++)
        {
            if(b[i])
            {
                continue;
            }

            int count=1;

            for(int j=i+1; j<arr.length; j++ )
          {
              if(arr[i] == arr[j])
              {
                  count++;
                  b[j]=true;

              }
          }

            System.out.println("count " +arr[i]+  ": " + count );

        }

    }
    public static void main(String[] args) {

        CountAllCharacterCountinString obj= new CountAllCharacterCountinString();
        obj.eachCharacterCount();
    }
}
