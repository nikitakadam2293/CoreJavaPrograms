package intervievquestion;

public class BreakAndContinueStatement {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++)
        {
            if(i== 2)
            {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println("break statement::");

        for (int i=1; i<=10; i++)
        {
            if(i== 2)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
