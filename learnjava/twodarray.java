package learnjava;

import java.util.Scanner;

public class twodarray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j = 0;


        int[][] newarr = new int[5][5];

        System.out.println(newarr[2][3]);

        System.out.println(newarr.length);

        System.out.println(newarr[0].length);

        //Traversal

        for(i=  0;i<newarr.length;i++)
        {
            for(j = 0;j<newarr[0].length;j++)
            {
                System.out.println(newarr[i][j] + " ");
            }
        }

        int max = Integer.MIN_VALUE;

        System.out.println("Enter the value if n: ");

        int n = sc.nextInt();

        int[] maxarr = new int[n];
    }
}
