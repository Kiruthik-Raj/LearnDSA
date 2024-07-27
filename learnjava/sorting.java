import java.util.Scanner;

public class sorting {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //selection sort

        int i = 0;
        int j = 0;

        int minidx = 0;
        int minval = 0;

        System.out.println("Enter the size of the array: ");
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");

        for(i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Selection Sort!");

        for(i = 0;i<n - 1;i++)
        {
            minval = arr[i];
            minidx = i;
            for(j = i + 1;j<n;j++)
            {
                if(arr[j] < minval)
                {
                    minval = arr[j];
                    minidx = j;
                }
                
            }
            int temp = arr[minidx];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

        System.out.println("Sorted array is: ");

        for(int u : arr)
        {
            System.out.print(u);
        }




    }
}
