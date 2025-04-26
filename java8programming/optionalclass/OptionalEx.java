package java8programming.optionalclass;

import java.util.Optional;

public class OptionalEx {

    public static Optional<String> getName()
    {
        String name = "java";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

        String str = null;
        if(str == null)  // null check
        {
            System.out.println("This is null object");
            System.out.println();
        }
        else
        {
            System.out.println(str.length());
        }

        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isPresent());
      //  System.out.println("value is : "+ optional.get());

        // print value which present if not value then
        // it print value inside( orElse)

        System.out.println(optional.orElse("No value in this object"));

        Optional<String> nameOptional = getName();

        System.out.println(nameOptional.orElse("null return"));
    }
}
