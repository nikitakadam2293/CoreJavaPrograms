package java8programming.methodreference;


import java.util.function.Predicate;

class StringUtils
{
     boolean startWithUpperCase(String s)
    {
        return Character.isUpperCase(s.charAt(0));

    }
}
public class ReferenceToInstanceMethodOfArbitraryethod {

    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();

       Predicate<String> predicate = stringUtils::startWithUpperCase;
       boolean result = predicate.test("Hello");
        System.out.println(result);

    }
}
