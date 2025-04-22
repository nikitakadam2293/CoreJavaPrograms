package polymorphism.overriding;

@MyAnnotation(value = "Test value" , number = 10)
public class TestAnnotation {
    public void tastMethod()
    {
        System.out.println("This is a test method");
    }

    public static void main(String[] args)throws Exception
    {
        MyAnnotation obj = TestAnnotation.class
                .getMethod("tastMethod")
                .getAnnotation(MyAnnotation.class);

        if(obj != null) {
            System.out.println("value " +obj.value());
            System.out.println("Number " + obj.number());
        } else
        {System.out.println("No annotation found on the method");
        }
        // Get the annotation applied to the class
        MyAnnotation classAnnotation = TestAnnotation.class.getAnnotation(MyAnnotation.class);

        if (classAnnotation != null) {
            System.out.println("Class annotation - value: " + classAnnotation.value());
            System.out.println("Class annotation - number: " + classAnnotation.number());
        } else {
            System.out.println("No annotation found on the class");
        }

    }
}
