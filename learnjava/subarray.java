import java.util.Scanner;

public class subarray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();

        int[] arr =new int[n];

        System.out.println("Enter the elements of the array: ");

        for(i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;

        for(start = 0;start<n;start++)
        {
            for(end = start;end<n;end++)
            {
                for(i = start;i<=end;i++)
                {
                    System.out.print(arr[i]);
                }

                System.out.println();
            }
        }
    }
}
