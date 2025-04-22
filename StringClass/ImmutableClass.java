package StringClass;

import javax.naming.OperationNotSupportedException;

final class User1
{
    private final String firstName;
    private final String lastName;
    private final Address1 address1;  //mutable clas reference

    public User1( String firstName, String lastName,Address1 address1) {
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.address1=address1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address1 getAddress() throws CloneNotSupportedException {
       //return address1;
       return new Address1((Address1) address1.clone()) ;
    }

    @Override
    public String toString() {
        return "User1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address1='" + address1 + '\'' +
                '}';
    }
}

///
 class Address1 implements Cloneable{
    String firstLine;
    String secondLine;
    String city;

    public Address1(String firstLine, String secondLine, String city) {
        super();
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.city = city;
    }

    public Address1(Address1 address1)
    {
        this.firstLine = address1.getFirstLine();
        this.secondLine = address1.getSecondLine();
        this.city = address1.getCity();
    }

    public String getFirstLine() {
        return firstLine;
    }


    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }


    public String getSecondLine() {
        return secondLine;
    }


    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Address1 [firstLine=" + firstLine + ", secondLine=" + secondLine
                + ", city=" + city + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       /* try{
           throw  new OperationNotSupportedException("We can not create clone of this object");
        }catch (OperationNotSupportedException e)
        {
          throw  new RuntimeException(e);
        }*/
       return super.clone();
    }
}
///
public class ImmutableClass {
    public static void main(String[] args) throws CloneNotSupportedException {

       // Address1 address1 = new Address1("Lane no 11","karve nagar" , "pune");

        //User1 u1= new User1("Nikita", "Kadam" , address1); mutable ch rahat hota therefore  new Address1("Lane no 11","karve nagar" , "pune"); he use kel

        User1 u1= new User1("Nikita", "Kadam" , new Address1("Lane no 11","karve nagar" , "pune"));
        System.out.println(u1.toString());  //User1{firstName='Nikita', lastName='Kadam', address='Address1 [firstLine=Lane no 11, secondLine=karve nagar, city=pune]'}

        // original
        Address1 address1= u1.getAddress();  // original / clone? => clone
        // after 113 clone return

        System.out.println("new : "+address1);

        /// ///////////////
        ////////////////

        address1.setFirstLine("Shahu colony lane no 10");

        System.out.println(u1.toString());

        System.out.println("new : "+address1); //new : Address1 [firstLine=Shahu colony lane no 10, secondLine=karve nagar, city=pune]


        /////==
//        address1.setCity("latur");
//        System.out.println(u1.toString()); //User1{firstName='Nikita', lastName='Kadam', address='Address1 [firstLine=Lane no 11, secondLine=karve nagar, city=latur]'}


    }
}
