package collectionframework;

import java.util.Arrays;

class ArrayListCustom<E>
{
   public static final int initialCapacity =10;
    int size=0;
    Object elementData[] ={};


    ArrayListCustom()
    {
        elementData = new Object[initialCapacity];
    }

    public void ensureCapacity()
    {
        int increaseCapacity = elementData.length*2;
        elementData= Arrays.copyOf(elementData,increaseCapacity);
    }

    public void add(E e)
    {
        if (size==elementData.length)
        {
            ensureCapacity();
        }
        elementData[size++] =e;

    }

    public void display()
    {
        System.out.println("Display : ");
        for(int i=0; i<size; i++)
        {
            System.out.println(elementData[i]);
        }
    }

    public  void remove(int index)
    {
        Object removeIndex= elementData[index];

        if(index<0 || index>=size)
        {
            throw new ArrayIndexOutOfBoundsException("Index " +index +"size "+size);
        }

        for(int i=index;i<=size-1; i++)
        {
             elementData[i] = elementData[i+1];
        }
        size--;
    }
}

public class CustomArrayList {

    public static void main(String[] args) {
        ArrayListCustom<Integer> obj = new ArrayListCustom<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        obj.display();

        System.out.println("Remove Element : ");

        obj.remove(1);
        System.out.println("After Remove : ");
        obj.display();

        ArrayListCustom<String> obj1 = new ArrayListCustom<String>();
        obj1.add("java");
        obj1.add("python");
        obj1.add("c#");
        obj1.add("c++");

        obj1.display();

        System.out.println("Remove : ");
        obj1.remove(3);
        obj1.display();


    }

}
