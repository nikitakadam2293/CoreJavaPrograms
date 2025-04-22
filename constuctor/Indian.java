package constuctor;

public class Indian {
    String name;
    int age;
    String address;
    String city;
    int pancard;
    int adharCard;

    public Indian(String name, int age, String address, String city, int pancard, int adharCard) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.pancard = pancard;
        this.adharCard = adharCard;
    }


    public static void main(String[] args) {
        Indian obj=new Indian("nikita",23,"pune","pune",123432,12334);
        System.out.println("name "+obj.name+ "age "+obj.age+"address " + obj.address+" city "+ obj.city+" pancard "+obj.pancard+"adharcard  "+obj.adharCard);
    }
}
