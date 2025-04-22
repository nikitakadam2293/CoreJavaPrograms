package ExceptionHandeling;

public class StaticBlockEx {

    static {

        try {

            System.out.println(10 / 0);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
    public static void main(String[] args) {

    }
}
