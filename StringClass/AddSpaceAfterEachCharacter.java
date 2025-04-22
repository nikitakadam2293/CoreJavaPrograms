package StringClass;

import java.util.Scanner;

public class AddSpaceAfterEachCharacter {


    void addSpaceAfterEachCharacter() {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (i > 0) {
                sb.append(" ");
            }

            sb.append(str.charAt(i));
        }

        System.out.println(sb);



       /* String s="";
        for(int i = 0; i<str.length(); i++)
        {
            if(i>0)
            {
                s.concat(" ");
            }
            s.concat(String.valueOf(str.charAt(i)));
        }

        System.out.println("str "+str);
        System.out.println("s" +s);
        /////
        /////// if using string insted of StringBuffer  below output gives therefore we use string Buffer
        bcz  string Buffer is mutable.

        output:
        Enter String :
        java
        str java
        s

    }
*/
    }
    public static void main(String[] args) {
        AddSpaceAfterEachCharacter obj = new AddSpaceAfterEachCharacter();
        obj.addSpaceAfterEachCharacter();
    }
}
