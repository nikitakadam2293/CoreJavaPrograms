package collectionframework;

import java.util.Arrays;


//passing object
class ArrayCust<T>
{
    int capacity =10;
    int size=0;
    Object[] arr ={};

    ArrayCust()
    {
        arr= new Object [capacity];
    }
    public void ensureCapacity()
    {
      int inccapacity=  arr.length*2;

        arr= Arrays.copyOf(arr,inccapacity);
    }

    public void add(T e)
    {
        if(size== arr.length)
        {
            ensureCapacity();
        }
        arr[size++] = e;
    }

    public void remove(T obj)
    {
      /*  if (index<0 || index>size)
        {
            throw new ArrayIndexOutOfBoundsException("index : " +index +"size : "+size);

        }*/

        int index =0;
          for (int i=0 ; i<size; i++)
        {
           if(arr[i].equals(obj))
           {
              index= i;
              break;
           }
        }

          for(int i=index; i<size;i++)
          {
              arr[i] =arr[i+1];
          }
          size--;

    }

    public void display()
    {
        for(int i=0; i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }

    //display specific object

    public void displaySpecific(T obj)
    {
        for(int i=0; i<size; i++)
        {
            if (arr[i].equals(obj))
            {
                System.out.println("Element found : "+obj +" at index is   " +i);
                break;
            }
            else
            {
                System.out.println("Element not found : "+obj+"  at index is " +i);
                break;
            }
        }
    }
}

public class CustomArray {

    public static void main(String[] args) {

        ArrayCust<Integer> obj = new ArrayCust<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        System.out.println("before");
        obj.display();

        obj.remove(2);
        System.out.println("after");

        obj.display();


        ArrayCust<String> obj1 = new ArrayCust<>();
        obj1.add("java");
        obj1.add("phython");
        obj1.add("c++");
        obj1.add("c");
        System.out.println("before");
        obj1.display();

        obj1.remove("c");
        System.out.println("after");

        obj1.display();

        obj1.displaySpecific("java");
        obj1.displaySpecific("java1");

    }
}
