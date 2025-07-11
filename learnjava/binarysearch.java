import java.util.*;

public class binarysearch {

    static int BinarySearch(int[] arr, int target)
    {
        int n = arr.length;
        int left = arr[0];
        
        int right = arr[n -1];

        int mid = left + (right - left) / 2;
        while(left <= right)
        {
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }

        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] samplearr = {22,23,56,78,90};
        System.out.println("Enter target: ");
        int tar = sc.nextInt();

        int res = BinarySearch(samplearr, tar);
        System.out.println(res);

    }
}
