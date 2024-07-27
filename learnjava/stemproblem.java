

import java.util.Scanner;

public class stemproblem {
    public static void main(String args[]){
        int i, j, temp, k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");

        int n = sc.nextInt();

        System.out.println("Enter the stem lengths one by one: \n");

        int arr[] = new int[n];

        for(i = 0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter the value of k: ");

        k = sc.nextInt();

        System.out.println("Sorting the array: ");

        for(i  = 0;i<n;i++)
        {
            for(j = i + 1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Printing the array in the required order: ");
        for(i = 0;i<k;i++){
            System.out.println(arr[i]);
        }

        for(i = n - 1;i>=k;i--)
        {
            System.out.println(arr[i]);
        }

        
    }
}
