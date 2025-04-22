package StringClass;

import java.util.Scanner;

public class FindCountOfWordinLine {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String");
        String s= sobj.nextLine();

        String [] word = s.split("\\W+");



        /*String format = \\W+  //"[\\s \\. ,]";
        String[] ss= s.split(format);
*/
       // String[] ss= s.split("\\s");

        System.out.println("Enter word which is count : ");
        String w= sobj.next();

        int count=0;

        /*for(String new1 : ss)
        {
            if(new1.equals(w))
            {
                count++;

            }
            //System.out.println(new1);
        }*/

        for (int i=0; i<word.length;i++)
        {
          if(word[i].equals(w))
            {
                count++;
            }
        }
        System.out.println(count);





    }
}
