package learnjava;

import java.util.*;

public class patterns {
    public static void main(String args[])
    {
        int i,j = 0;
        int k = 1;
        int l = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of pattern: \n");
        int n = sc.nextInt();
        System.out.print("Printing the pattern of the entered dimension!!\n");
        System.out.print("Star Pattern\n");
        for(i = 0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("Number Pattern 1\n");

        System.out.print("\n");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print((i+1) + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Number Pattern 2\n");
        System.out.print("\n");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print((j+1) + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Number Pattern 3");
        System.out.print("\n");

        for(i = n;i>0;i--)
        {
            for(j = n;j>0;j--)
            {
                System.out.print((i) + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Number Pattern 4");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print((k) + " ");
                k++;
            }
            System.out.print("\n");
        }
        System.out.println("Number Pattern 5");
        System.out.println("\n");

        for(i = 0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print((l) + " ");
                l+=2;
            }
            System.out.print("\n");
        }

        System.out.println("Number Pattern 6");
        for(i = 1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((i*j) + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Number Pattern 7");
        for(i = 0;i<n;i++)
        {
            for(j = 0;j<n;j++)
            {
                System.out.print("(" + i + ' ' + j + ")");
                k++;
            }
            System.out.print("\n");
        }

    }
}
