package learnjava;

import java.util.*;

class Darr {
    private int[] arr;
    private int size;
    private static final int initialcapacity = 4;
    private int capacity;

    Darr(){
        size = 0;
        arr = new int[initialcapacity];
        capacity = initialcapacity;
    }

    public void insertAtEnd(int val)
    {
        if(size == capacity)
        {
            expandArr();
        }
        arr[size++] = val;
    }

    public void expandArr()
    {
        capacity = capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void shrinkArr()
    {
        capacity = capacity /= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void insertAtIndex(int pos, int val)
    {
        int i = 0;
        for(i = size - 1;i>=pos;i--)
        {
            arr[i] = arr[i + 1];
        }
        arr[pos] = val;
        size++;
    }

    public void deleteAtIndex(int pos)
    {
        int i = 0;
        for(i = pos+1;i<size;i++)
        {
            arr[i - 1] = arr[i];
        }
        size--;

        if(capacity < initialcapacity && capacity > 3 * size)
        {
            shrinkArr();
        }
    }

    public void displayArr()
    {
        int i = 0;
        for(i = 0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class dynamicarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pos,val;
        Darr DA = new Darr();
        while(true)
        {
            System.out.println("1.Insert!!");
            System.out.println("2.Insert at Index!!");
            System.out.println("3.Expand Array!!");
            System.out.println("4.Shrink Array!!");
            System.out.println("5.Delete From Position!!");
            System.out.println("6.Display Array!!");
            System.out.println("7.Exit!!");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be inserted : ");
                    int ele = sc.nextInt();
                    DA.insertAtEnd(ele);
                    break;

                case 2:
                    System.out.println("Enter the position at which the element should be inserted : ");
                    pos = sc.nextInt();
                    if(pos < 0)
                    {
                        System.out.println("Invalid position entered!!");
                        break;
                    }
                    System.out.println("Enter the value to be inserted: ");
                    val = sc.nextInt();
                    DA.insertAtIndex(pos, val);
                    break;

                case 3:
                    DA.expandArr();
                    System.out.println("Array Expanded!");
                case 4:
                    DA.shrinkArr();
                    System.out.println("Array Shrinked !");

                case 5:
                    System.out.println("Enter the position from where the element should be deleted!");
                    pos = sc.nextInt();
                    if(pos < 0)
                    {
                        System.out.println("Position invalid!!");
                        break;
                    }
                    DA.deleteAtIndex(pos);
                case 6:
                    DA.displayArr();
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}
