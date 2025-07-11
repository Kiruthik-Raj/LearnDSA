import java.util.*;

public class secondlargest {
    public static int secondLargest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr)
        {
            if(num > largest)
            {
                second = largest;
                largest = num;
            }
            else
            {
                if(num > second && num != largest)
                {
                    second = num;
                }
            }

            
        }

        return second == Integer.MIN_VALUE ? -1 : second;

    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) + " th element: ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        int res = secondLargest(arr);

        System.out.println(res);

        System.out.println(Arrays.toString(arr));
    }
}
