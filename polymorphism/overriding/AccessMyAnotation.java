package polymorphism.overriding;

@MyAnnotation(value = "one" )
public class AccessMyAnotation {

    public static void main(String[] args) {

        MyAnnotation obj = AccessMyAnotation.class.getAnnotation(MyAnnotation.class);

        if(obj!=null)
        {
            System.out.println("class anotation value : "+obj.value() );
            System.out.println("class anotation number : "+ obj.number());
        }
    }
}
