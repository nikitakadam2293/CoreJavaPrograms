package java8programming.optionalclass;


import java.util.Optional;

public class OptionalMethod {

    public static void main(String[] args) {

        String s = "java language";

        Optional<String> o = Optional.of(s);
        System.out.println("Optional name : " + o);  // Optional name : Optional[java language]

        System.out.println("------------------------------------------");
        String str = null;
        Optional<String> ofNullable = Optional.ofNullable(str);
        System.out.println("OfNullable is : " + ofNullable);  // OfNullable is : Optional.empty

        System.out.println("------------------------------------------");

        Optional<String>  a = Optional.of("abc");
        if(a.isPresent())
        {
            System.out.println("Name is : " + a.get());
        }
        else
        {
            System.out.println("Not present ");
        }

        // Name is : abc
        System.out.println("------------------------------------------");

        Optional<String> b  = Optional.of( "bbbb");
        String name = b.get();
        System.out.println("Name : " + name);  // Name : bbbb

        System.out.println("------------------------------------------");

        Optional<String> c = Optional.empty();
        String city = c.orElse("optional is empty");
        System.out.println(city);      // optional is empty

        Optional<String> cc = Optional.of("zz");
        String cityc = cc.orElse("Empty value ");
        System.out.println(cityc);    // zz

        System.out.println("------------------------------------------");

        Optional<String> d = Optional.empty();
        String email = d.orElseGet(()->"aa@gmail.com");
        System.out.println("Email is : " + email);  // Email is : aa@gmail.com


        Optional<String> dd = Optional.of("java");
        String email1 = dd.orElseGet(()->"zzzz@gmail.com");
        System.out.println("Emaillll : " + email1);    // Emaillll : java

        System.out.println("------------------------------------------");

        Optional<String> optionalPhone = Optional.of("1234567890");
        optionalPhone.ifPresent(phone-> System.out.println("Phone : " + phone));  // Phone : 1234567890


        System.out.println("------------------------------------------");


        Optional<String> ee = Optional.of("Hello");
        String eee = ee.orElseThrow(()-> new NullPointerException("Null p E "));


        Optional<String> e = Optional.empty();
        String name1 = e.orElseThrow(()->new IllegalArgumentException("Name is absent "));

    }
}
