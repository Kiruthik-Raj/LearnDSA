
import java.util.*;

public class maxslidingwindow {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j,max = 0;
        
        System.out.println("Enter count of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) +" element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element count of the subarray: ");
        int k = sc.nextInt();
        int[] maxarr = new int[n - k + 1];

        for(i = 0;i<=n - k;i++)
        {
            max = arr[i];
            for(j = i+1;j<i+k;j++)
            {
                
                if(max < arr[j])
                {
                    max = arr[j];
                }
             }
            maxarr[i] = max;
        }

        for(i = 0;i< maxarr.length;i++)
        {
            System.out.println(maxarr[i]+" ");
        }
        
    }
}
