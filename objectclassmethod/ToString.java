package objectclassmethod;

public class ToString {

    private int id= 1;
    private String name=" abc";

   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name=" + name ;
    }

    public static void main(String[] args) {

        ToString obj=new ToString();
        System.out.println(obj);  //objectclassmethod.ToString@58372a00

    }
}
/*
Java automatically converts the int into its string representation.
 l̥This process is handled by the String.valueOf(int) method internally.
* */