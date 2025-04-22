package polymorphism.overriding;
import java.util.List;

public class SafevarArgs {


    @SafeVarargs
    public static void print(List<String>... lists) {
            for (List<String> list : lists) {
                System.out.println(list);
            }
        }

        public static void main(String[] args) {
            List<String> list3 = List.of( );


            List<String> list1 = List.of("A", "B", "C" );
            List<String> list2 = List.of("X", "Y", "Z");
            print(list1, list2);
        }
    }


