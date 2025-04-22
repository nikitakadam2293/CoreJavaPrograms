package polymorphism.overriding;

public class ObjecttoString {
     String firstName;
     String lastName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName )
    {
        this.firstName= firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public String  toString()
    {
        return "FirstName :"+ firstName + ",  " + "LastName : "+ lastName + "." ;
    }

    public static void main(String[] args) {
        ObjecttoString obj = new ObjecttoString();
       obj.setFirstName("Nikita");
        obj.setLastName("Kadam");
        System.out.println(obj);
       // System.out.println( obj.toString());

        System.out.println(obj.hashCode());
    }
}
