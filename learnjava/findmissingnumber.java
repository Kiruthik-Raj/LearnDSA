import java.util.*;

public class findmissingnumber {

    public static int findMissingNumber(int[] arr)
    {
        int sum = 0;
        int total = 0;
        int n = arr.length;
        
        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        total = (n * (n + 1)) / 2;

        if(total == sum)
        {
            return arr[0] - 1;
        }
        return total - sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n , i= 0;
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

        int res = findMissingNumber(arr);
        System.out.println("Number is: ");
        System.out.println(res);

        System.out.println(arr.length);
    }
}
