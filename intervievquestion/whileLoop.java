package intervievquestion;

public class whileLoop {

    public static void main(String[] args) {

        System.out.println("While Loop");
        int i=1;
        while (i<=4)
        {
            System.out.println(i);
            i++;
        }
        System.out.println();
        System.out.println("Do while loop ");

        int j=4;
        do{

            System.out.println("J : " + j);
            j++;
        }while (j<=8);
    }
}
