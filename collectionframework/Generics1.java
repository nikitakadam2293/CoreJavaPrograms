package collectionframework;

 class Generics<T> {

    public T addition(T no1, T no2) {
        if ((no1 instanceof Integer) && (no2 instanceof Integer)) {
            return (T) (Integer) ((Integer) no1 + (Integer) no2);
        }
        else if ((no1 instanceof Float) && (no2 instanceof Float)) {

            return (T) (Float) ((Float) no1 + (Float) no2);
        }
        else if ((no1 instanceof Double) && (no2 instanceof Double)) {
            return (T) (Double) ((Double) no1 + (Double) no2);
        }
        else {
            return null;
        }
    }
}

public class Generics1
{
    public static void main(String[] args) {

        Generics<Integer> obj = new Generics<Integer>();
        Integer ret =0;
        ret=obj.addition(10,11);
        System.out.println("integer Addition is " +ret);


        Generics<Float> obj1 = new Generics<Float>();
        Float fret=0.0f;
        fret =obj1.addition(11.11f,11.88f);
        System.out.println("float Addition is " +fret);

    }
}