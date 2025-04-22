package Static;

public class HowToUseStatic {

}


class Indian {
    String name;
    int age;
    String address;
    int aadharcard;
    int pancard;
    String city; //

    static String citizenship = "Indian";    //static

    public static void main(String[] args) {
        Indian nikita = new Indian();
        nikita.name = "Nikita";
        nikita.citizenship = "Indian";

        Indian vaishnavi = new Indian();
        vaishnavi.name = "Vaishnavi";
        vaishnavi.citizenship = "Indian";  // static variable such a variable which object refer same value (me)

        // String v1= Indian.citizenship;


    }

}