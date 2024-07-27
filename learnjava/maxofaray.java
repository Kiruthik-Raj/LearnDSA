import java.util.Scanner;

public class maxofaray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        int i = 0;

        System.out.println("Enter the elements of the array: ");

        for(i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(i = 0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println("Max of the array is: " + max);

    }
}
