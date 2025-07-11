import java.util.*;

public class mergesortedarrays {

    public static int[] mergeSortedArrays(int[] arr1 , int[] arr2)
    {
        int[] res = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                res[k++] = arr1[i++];
            }
            else
            {
                res[k++] = arr2[j++];
            }

        }

        while(i < arr1.length)
        {
            res[k++] = arr1[i++];
        }

        while(j < arr2.length)
        {
            res[k++] = arr2[j++];
        }


        return res;


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n1, n2, i = 0;

        System.out.println("Enter length of array 1 : ");
        n1 = sc.nextInt();

        System.out.println("Enter length of array 2 : ");
        n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(i = 0;i<n1;i++)
        {
            System.out.println("Enter the  " + (i + 1) + " th element of array 1: ");
            arr1[i] = sc.nextInt();
        }

        for(i = 0;i<n2;i++)
        {
            System.out.println("Enter the  " + (i + 1) + " th element of array 2: ");
            arr2[i] = sc.nextInt();
        }

        int res[] = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(res));

    }
}
