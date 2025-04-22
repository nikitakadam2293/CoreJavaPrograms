package objectclassmethod;

public class Clone1Method implements Cloneable {

    int id =1;
   String name = "abc";


    public static void main(String[] args) throws CloneNotSupportedException {
        Clone1Method obj = new Clone1Method();
        Cloneable obj2 = (Cloneable) obj.clone();

    }

}
