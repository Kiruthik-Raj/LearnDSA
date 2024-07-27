

import java.util.Scanner;

public class twodarray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j = 0;


        int[][] newarr = new int[5][5];

        System.out.println(newarr[2][3]);

         //row length of 2D array

        System.out.println(newarr.length);

        //column length of 2D array

        System.out.println(newarr[0].length);

        //Traversal

        for(i=  0;i<newarr.length;i++)
        {
            for(j = 0;j<newarr[0].length;j++)
            {
                System.out.print(newarr[i][j] + " ");
            }
        }

        int max = Integer.MIN_VALUE;

        System.out.println("\nEnter the value of n: ");

        int n = sc.nextInt();

        int[] maxarr = new int[n];

        for(i = 0;i<n;i++)
        {
            System.out.println("Enter the " + (i + 1) + " th element: ");
            maxarr[i] = sc.nextInt();
        }

        //Logic for finding the max value


    for(i = 0;i<n;i++)
    {
        if(maxarr[i] > max)
        {
            max = maxarr[i];
        }
    }

    System.out.println("Maximum of the array elements is: " + max);

    //Logic for reversing an array

    int[] revarr = {1,2,3,4,5,6,7,8};

    int k = 0;
    int temp = 0;
    i = 0;
    j = revarr.length - 1;

    while(i<j)
    {
        temp= revarr[i];
        revarr[i] = revarr[j];
        revarr[j] = temp;

        i++;
        j--;
    }

    //extra space complexity logic for reversing using a new array and insertion of elements into that array in reverse order

    int[] newrevarr = new int[revarr.length];

    for(i=revarr.length - 1;i>=0;i--)
    {
        newrevarr[i] = revarr[i];
    }

    System.out.println("Printing the reverse array! ");

    for(i=0;i<newrevarr.length;i++)
    {
        System.out.print(newrevarr[i] + " ");
    }


    System.out.println("\n Printing the reversed array: ");

    for(k  = 0;k<revarr.length;k++)
    {
        System.out.print(revarr[k] +  " ");
    }



    }
}
