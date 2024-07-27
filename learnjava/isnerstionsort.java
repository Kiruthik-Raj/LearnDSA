import java.util.Scanner;
public class isnerstionsort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");

        int i = 0;
        int j = 1;
        int temp = 0;

        for(i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Insertion sort!!");

        for(i = 1;i<n;i++)
        {
            for(j = i;j>0;j--)
            {
                if(arr[j]<arr[j - 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println("Sorted array is: ");

        for(int k : arr)
        {
            System.out.print(k);
        }
    }
}
