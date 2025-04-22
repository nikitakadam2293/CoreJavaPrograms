package StringClass;

final class User
{
    private final String firstName;
    private final String lastName;
    private final Address address;
   // private final String address;


    public User(String firstName,String lastName,Address address)  //String address
    {
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() throws CloneNotSupportedException
    {
        return (Address) address.clone();
        // return new Address((Address) address.clone());
        // return address;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

 class Address implements Cloneable
{
    String firstLine;
    String secondLine;
    String city;
    public Address( String firstLine, String secondLine,String city)
    {
        super();
        this.firstLine=firstLine;
        this.secondLine=secondLine;
        this.city=city;
    }

    public Address(Address address)
    {
        this.firstLine= address.getFirstLine();
        this.secondLine=address.getSecondLine();
        this.city=address.getCity();

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
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
   @Override
    protected Object clone()throws CloneNotSupportedException
    {
         /* try {
            throw new OperationNotSupportedException("We can not create clone of this object");
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }*/

        return super.clone();
    }
}



// if we create another class Address and
public final class CustomImmutableclass
{

    public static void main(String[] args) throws CloneNotSupportedException {

        // /Address address = new Address("Lane no 11", "Karve Nagar", "Pune");
        //User u1= new User("Nikita" , "Kadam" ,"Pune");

        User u1= new User("Nikita" , "Kadam" ,new Address("lane no 11" ,"karve nagar" ,"pune"));

        System.out.println(u1.toString());     //User{firstName='Nikita', lastName='Kadam', address='Address{firstLine='lane no 11', secondLine='karve nagar', city='pune'}'}


        Address address= u1.getAddress();
        System.out.println(address);  //Address{firstLine='lane no 11', secondLine='karve nagar', city='pune'}


        address.setCity("Nagar");
        System.out.println("== "+ u1);  //== User{firstName='Nikita', lastName='Kadam', address='Address{firstLine='lane 10', secondLine='karve nagar', city='pune'}'}


        ////
        //Original Vivek =>
       // Address address = u1.getAddress(); // original or cloned ?
        //Cloned Vivek   =>
        // address.setFirstLine("Shahu colony lane no 10");  //Modifying Mutable object

       // System.out.println(u1.toString()); //
        ////





    }
}
