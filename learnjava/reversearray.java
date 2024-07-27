import java.util.Scanner;

public class reversearray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int temp = 0;

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i = 0;
        int j = n - 1;

        System.out.println("Enter the elements of the array: ");

        for(i  = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        while(i<j)
        {
            temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        

        for(int k = 0;k<n;k++)
        {
            System.out.println(arr[k]);
        }


    }
}
