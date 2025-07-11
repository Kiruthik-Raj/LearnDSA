import java.util.*;

public class kadane{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n , i = 0;
        System.out.println("Enter no of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) + " th element: ");

            arr[i] = sc.nextInt();

        }

        sc.close();

        int max_so_far = arr[0], max_ending_here = arr[0];

        for(i = 1;i<n;i++)
        {
            max_ending_here = Math.max(arr[i], arr[i] + max_ending_here);
            max_so_far = Math.max(max_so_far, max_ending_here);

            System.out.println(max_ending_here + "\n");
            System.out.println(max_so_far + "\n");


        }

        System.out.println("Max sum of subarray : " + max_so_far);

    }
}